package com.example.util.hacker;

import java.util.Collections;

public class MajEleInArray {
/*reference: https://www.ideserve.co.in/learn/find-majority-element-in-an-array*/
    public static void main(String[] args) {
        /*Boyer-Moore Vote Algorithm*/
        int n[] = {1,3,2,3,4,3,2,3,3,3};
        int count=0;
        Integer candidate = null;

        for(int i=0;i<n.length;i++){
            if(count==0){
                candidate = n[i];
                count=1;
                continue;
            }else{
                if(candidate==n[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }

        if(count==0){
            System.out.println("no maj elemfound");

        }

        count=0;
        for(int j=0;j<n.length;j++){
            if(candidate==n[j]){
                count++;
            }
        }
        if(count>n.length/2){
            System.out.println("Maj ele found:"+candidate);
        }
    }
}


/*Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.

Input:
The first line of the input contains T denoting the number of testcases. The first line of the test case will be the size of array and second line will be the elements of the array.

Output:
For each test case the output will be the majority element of the array. Output "-1" if no majority element is there in the array.

Constraints:
1 <= T<= 100
1 <= N <= 107
0 <= Ai <= 106

Example:
Input:
2
5
3 1 3 3 2
3
1 2 3

Output:
3
-1

Explanation:
Testcase 1: Since, 3 is present more than N/2 times, so it is the majority element.
 */
