package com.example.util.hacker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StringToInt {
    public static void main(String[] args) {
        String str = "1234";
        Queue<Integer> q1 = new LinkedList<Integer>();
        int sum=0;
        for(int i=str.length()-1;i>=0;i--){
            int c = (int)str.charAt(i)-'0';
            sum=(sum*10)+c;
        }
    }
}
