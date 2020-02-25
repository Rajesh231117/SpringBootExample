package com.example.util;

import java.util.*;

public class MapOperations {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap();
        map.put(1,14);
        map.put(2,13);
        map.put(3,12);
        map.put(4,11);

        int i = Collections.max(map.values());
        System.out.println(i);

        Set<Map.Entry<Integer,Integer>> e=map.entrySet();

        for (Map.Entry<Integer,Integer> e1:e) {
            System.out.println(e1.getKey()+":"+e1.getValue());
        }
        System.out.println("*********");
        Iterator iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());

        }
    }
}
