package com.example.util.hacker;

public class EqulibriumIndex {

    /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int T = Integer.parseInt(line1);

        for(int s=0;s<T;s++){
            String line2 = br.readLine();
            int L = Integer.parseInt(line2);
            int arr[]=new int[L];

            String line3 = br.readLine();
            String V[] = line3.split(" ");
            int val[]=new int[V.length];

            for(int q=0;q<V.length;q++){
                val[q] = Integer.parseInt(V[q]);
            }*/
    public static void main(String[] args) {
        int n[] = {-4,4,-4};
        int sum=0;

        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        int leftSum=0;

        for(int k=0;k<n.length;k++){

            sum=sum-n[k];
            if(leftSum==sum){
                System.out.println(n[k]);
            }
            leftSum+=n[k];
        }
    }




}

/*Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.

Output:
For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Ai <= 108

Example:
Input:
2
1
1
5
1 3 5 2 2

Output:
1
3

Explanation:
Testcase 1: Since its the only element hence its the only equilibrium point.
Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).*/
