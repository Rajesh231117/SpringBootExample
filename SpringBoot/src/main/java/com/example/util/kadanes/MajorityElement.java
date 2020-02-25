package com.example.util.kadanes;

/*Moores Algorithm*/
public class MajorityElement {
    public static void main(String[] args) {

        int arr[]={1,3,2,3,3,2,2,3,3,3};

        int candidate=arr[0],count=1;

        for(int i=1;i<arr.length;i++){
            if(candidate==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate = arr[i];
                count=1;
            }

        }

        if(count>0){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==candidate){
                    sum++;
                }
            }

            if(sum>(arr.length/2)){
                System.out.println("Maj exist as:"+candidate);
            }else{
                System.out.println("Maj not exist");
            }

        }
    }


}
