package com.example.util.hacker;

import java.util.HashMap;
//find the indexes such that by adding those can give the target value
public class Sum2 {
    public static void main(String[] args) {
        int a[] ={7,1,2,3,4,6,5,8,11,13,-1,0,12};

        HashMap<Integer,Integer> map = new HashMap();
        int target=12;
        int j=-1,k=-1;
        for(int i=0;i<=a.length-1;i++){
            int sum =target-a[i];
            if(map.containsKey(sum)){
               j=i;
               k=map.get(sum);
                System.out.println(j+","+k);
            }else{
                map.put(a[i],i);
            }
        }

        if(j!=-1 && k!=-1){
           // System.out.println(j);
           // System.out.println(k);
        }
    }
}
