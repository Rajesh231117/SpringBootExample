package com.example.util.kadanes;

public class MaxSubArrayWith0And1 {
    public static void main(String[] args) {
        int arr[]={1,0,0,0,1,1};
        find(arr);
        int maxEndHere=0,maxSoFar=0;
        int start=0,end=0,s=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=(arr[i]==0?-1:1);
            maxEndHere+=arr[i];


            if(maxEndHere==0 && len<(end-start) ){
                len=(end-start);
            }
            /*if(maxEndHere>maxSoFar){
                maxSoFar = maxEndHere;
                start=s;
                end=i;
            }

            if(maxEndHere<0){
                maxEndHere=0;
                s=i+1;
            }*/
        }

        System.out.println(maxSoFar);
        System.out.println("at:"+start+","+end);
    }

    public static void find(int arr[]){
        int start=0,end=0;
        int sum=0,len=-1;

        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]==0?-1:1);

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==0){
                    sum+=-1;
                }else{
                    sum+=1;
                }

                if(sum==0 && len<(j-i)){
                    len=j-i;
                    start=i;

                }
            }
        }
        end=start+len;
        System.out.println(start+","+end);


    }
}
