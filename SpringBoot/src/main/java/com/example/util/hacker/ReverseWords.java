package com.example.util.hacker;

public class ReverseWords {

    public static void main(String[] args) {
        String str = "1.2.3.4.5";
        String st[] = str.split("\\.");
        String s="";

        for(int i=st.length-1;i>=0;i--){
            s+=st[i]+".";

        }

        System.out.println(s.substring(0,s.length()-1));
    }
}
