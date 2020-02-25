package com.example.util.kadanes;

public class SubArrayWithGivenValue {
    public static void main(String[] args) {
        int arr[]={1,2,-3,4,5};
        int sum=arr[0],val=9;
        int start=0;
        for(int i=1;i<=arr.length;i++){
            while(sum>val && start<i){
                sum-=arr[start];
                start++;
            }
            if(sum==val){
                System.out.println(start+","+i);
            }
            if(i<arr.length){
                sum+=arr[i];
            }
        }
    }
}
