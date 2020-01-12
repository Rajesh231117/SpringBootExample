package com.example.util;

public class Fibonacci {

    public static void main(String[] args) {
        int t1=0,t2=1;
        for(int i=0;i<40;i++){
            System.out.print(t1+" ");
            int sum = t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}
