package com.example.util;

import java.util.HashMap;

public class CountOfCharInString {

    public static void main(String[] args) {
        String str = "Rajeshr";
        char ch[] = str.toCharArray();
        HashMap <String,Integer>map = new HashMap();

        for(int i=0;i<=ch.length-1;i++){
            String s= String.valueOf(ch[i]).toLowerCase();
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }

        System.out.println(map);

    }
}

class Test123 extends CountOfCharInString{
    public void test123(){

    }
    public static void main(String[] args) {
        CountOfCharInString c = new CountOfCharInString();
     //ClassCastException will come
        ((Test123)c).test123();
    }
}
