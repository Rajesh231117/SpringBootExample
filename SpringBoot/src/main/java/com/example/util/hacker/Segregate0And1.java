package com.example.util.hacker;

public class Segregate0And1 {

    public static void main(String[] args) {
        int a[] ={1,0,1,1,0,1};
        int left=0; int right=a.length-1;
        while(left<right){

            while(a[left]==0 && left<right){
                left++;
            }

            while(a[right]==1 && left<right){
                right--;
            }

            if(left<right){
                int tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
            }


        }
        for(int k=0;k<a.length-1;k++){
            System.out.println(a[k]);
        }

    }
}
