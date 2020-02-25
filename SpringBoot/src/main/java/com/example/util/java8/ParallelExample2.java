package com.example.util.java8;

import java.util.ArrayList;
import java.util.List;

public class ParallelExample2 {

    public static void main(String[] args) {

        System.out.println("Normal...");

        List<String> alpha = getData();
        alpha.stream().distinct().forEach(System.out::print);

        System.out.println("Parallel...");

        List<String> alpha2 = getData();
        alpha2.parallelStream().forEachOrdered(System.out::print);

    }

    private static List<String> getData() {

        List<String> alpha = new ArrayList<>();

        int n = 97;  // 97 = a , 122 = z
        while (n <= 122) {
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }

        return alpha;

    }

}

