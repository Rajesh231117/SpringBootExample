package com.example.util.hacker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,-1};
        int sum = maxSubArray(arr);
        System.out.println(sum);
    }

    public static int maxSubArray(int a[]){
        int localSum=a[0],globalSum=a[0];

        for(int i=1;i<a.length;i++){
            localSum=Math.max(a[i],a[i]+localSum);
            globalSum=Math.max(localSum,globalSum);
        }
        return globalSum;
    }

    public static void main1 (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for(int i=0;i<T;i++){
            int C=Integer.parseInt(line);
            String arrS[]= br.readLine().split(" ");
            List a = Arrays.asList(arrS).stream().map(c -> Integer.parseInt(c)).collect(Collectors.toList());
            Integer arri[] = (Integer[]) a.toArray();
        }
    }

}
