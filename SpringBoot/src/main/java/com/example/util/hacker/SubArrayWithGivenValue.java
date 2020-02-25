package com.example.util.hacker;

public class SubArrayWithGivenValue {

    public static void main(String[] args) {
        int a[]={1,2,-3,4,5};
        subArrayWithGivenValue(a,9);
    }

    public static void subArrayWithGivenValue(int n[],int val){
        int sum=n[0],start=0;


        for(int i=1;i<n.length;i++){
            while(sum>val && start<i-1){
                sum-=n[start];
                start++;
            }
            if(sum==val){
                System.out.println(start+","+(i-1));
                return;
            }
            if(i<n.length){
                sum+=n[i];
            }

        }
        System.out.println("Not found");
    }
}
