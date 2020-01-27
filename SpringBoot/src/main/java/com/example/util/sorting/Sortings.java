package com.example.util.sorting;

public class Sortings {

    public static void main(String[] args) {
        int arr[] = {11,77,1,88,-1,-22,6};
       /* for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr.length);
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }*/

        Sortings.selection(arr);
    }

    public static void selection(int a[]){

        for(int i=0;i<a.length-1;i++){
            int index=i;
            for(int j=i;j<a.length;j++){
                if(a[index]>a[j]){
                   index=j;
                }
            }

            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }

    public static void bubble(int a[]){

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
}}
