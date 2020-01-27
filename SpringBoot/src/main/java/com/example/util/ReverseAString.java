package com.example.util;

public class ReverseAString {
    public static void main(String[] args) {
       String str= ReverseAString.reverse("RAJESH");
        System.out.println(str);
    }
    static String str="";
    public static String reverse(String s){

        if(s.length()==1){
            return s;
        }
        else{
            str += s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
            return str;
        }
    }
}
