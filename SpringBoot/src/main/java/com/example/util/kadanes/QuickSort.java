package com.example.util.kadanes;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={11,3,5,22,6};


    }

    public static void sort(int arr[],int i,int j){
        int i=0,j=arr.length-1,pivot=arr.length-1;

        while(i<j){
            while(arr[i]>pivot){
                i++;
            }

            while(arr[j]<pivot){
                j--;
            }

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

            //if()
        }
    }
}
