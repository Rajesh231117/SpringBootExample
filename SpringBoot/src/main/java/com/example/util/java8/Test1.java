package com.example.util.java8;

public interface Test1 {
    void print();
    void print1();
    void print2();
    default  int add(int a,int b){
        return (a+b)*2;
    }

    default  int add1(int a,int b){
        return (a+b);
    }
}


interface Test2{
    default  int add(int a,int b){
        return a+b;
    }
}

class A implements Test1,Test2{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(2,2));
        a.print();

    }

    @Override
    public void print() {
        System.out.println("A");
    }

    @Override
    public void print1() {
        System.out.println("B");
    }

    @Override
    public void print2() {
        System.out.println("C");
    }

    @Override
    public int add(int a, int b) {
       return Test1.super.add(a,b);
    }
}
