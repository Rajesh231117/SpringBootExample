package com.example.util.hacker;

public class StringDivisability {

    public static void main(String[] args) {
        strDivisable("abaabaaba","aba");
    }

    public static int strDivisable(String s, String t){

        if(s.length()>t.length()){
        int i = divisable(s,t);
        }
        return 0;
    }

    private static int divisable(String s1, String t1){
        String str=t1;
        String smallStr;
        boolean flag =false;
        if(s1.length()>t1.length()){
            while(s1.length()>t1.length()){
                t1 = concate(t1,str);
                if(s1.equals(t1)){
                    flag = true;
                    System.out.println("yes,divisable");
                    break;
                }
            }
        }

        if(flag){
            int j=smallStr(s1,str);
            System.out.println(j);
        }
        return 0;
    }

    private static int smallStr(String s3,String t3){
        String tmp = t3;

        while(tmp.length()>1){
            int t= tmp.length()/2;
            tmp = tmp.substring(0,t+1);
            if(isExpandable(s3,tmp)){
                return tmp.length();
            }
        }
        return  -1;
    }

    private static boolean isExpandable(String s4,String t4){
        String tmp = t4;
        while (s4.length()>t4.length()){
            t4 = concate(t4,tmp);
            if(s4.equals(t4)){
                return  true;
            }
        }

        return false;
    }
    private static String concate(String tmp,String s2){
        return  tmp.concat(s2);
    }
}
