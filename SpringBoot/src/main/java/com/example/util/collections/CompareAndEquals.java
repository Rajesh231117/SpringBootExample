package com.example.util.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareAndEquals {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"aaa",1000,"test@gmail.com");
        Employee e2 = new Employee(2,"bbb",1000,"test@gmail.com");
        System.out.println(e1.equals(e2));
        System.out.println(e1==e2);
        TreeSet tr = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 =(Employee)o1;
                Employee e2 =(Employee)o2;
                return e1.getEmployeeName().compareTo(e2.getEmployeeName());
            }
        });
        tr.add(e1);
        tr.add(e2);
        System.out.println(tr);
    }
}

class Employee implements Comparable{

    private Integer employeeId;
    private String employeeName;
    private Integer salary;
    private String email;

    public Employee(Integer employeeId, String employeeName, Integer salary, String email) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.email = email;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
        result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (employeeId == null) {
            if (other.employeeId != null)
                return false;
        } else if (!employeeId.equals(other.employeeId))
            return false;
        if (employeeName == null) {
            if (other.employeeName != null)
                return false;
        } else if (!employeeName.equals(other.employeeName))
            return false;
        if (salary == null) {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        return true;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (!employeeId.equals(other.employeeId))
            return false;

        return true;
    }*/


    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
                + ", email=" + email + "]";
    }

    @Override
    public int compareTo(Object o) {
        Employee e =(Employee)o;
        return this.getEmployeeId()>e.getEmployeeId()?-1:1;
    }
}
