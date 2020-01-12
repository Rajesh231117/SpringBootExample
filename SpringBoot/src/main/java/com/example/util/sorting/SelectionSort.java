package com.example.util.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {22,33,11,4,-4};
String str = "fsdfsacv";
        for(int i=0;i<arr.length;i++){
            int idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[idx]>arr[j]){
                    idx=j;
                }
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }

    public static  void sortString(String str){

    }
}
