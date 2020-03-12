package com.example.util.kadanes;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int ar[]={-2,-1,-3};
        maxSumSubArray(ar);
    }


    public static void maxSumSubArray(int arr[]){
        int maxSoFar=Integer.MIN_VALUE,maxEndHere=0;
        int start=0,end=0,s=0;
        for (int i=0;i<arr.length;i++){
            maxEndHere=Math.max(arr[i],maxEndHere+arr[i]);

            if(maxEndHere>maxSoFar){
                maxSoFar=maxEndHere;
                start=s;
                end=i;
            }
           /* if(maxEndHere<0){
                maxEndHere=0;
                s=i+1;
            }*/
        }
        //System.out.println("MaxSubArraySum found bw:"+start+","+end);
        System.out.println("MaxSubArraySum:"+maxSoFar);
    }

}
