package com.example.util;

public class FibonacciRecursive {


/*TODO with dynamic approach*/
static int fib(int n)
{
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fib(n-1) + fib(n-2);
}

    public static void main (String args[])
    {
        try {

        }
        catch (ArrayIndexOutOfBoundsException ae){
            throw new ArrayIndexOutOfBoundsException();
        }
        int n = 4;
        System.out.println(fib(n));
    }


    static int fibNonRec(int n){

    int t1=0,t2=1;
    int sum=0;
    for(int i=0;i<n;i++){
        System.out.println(t1);
        sum=t1+t2;
        t1=t2;
        t2=sum;

    }
    return 0;
    }

}
