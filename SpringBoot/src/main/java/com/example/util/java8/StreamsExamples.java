package com.example.util.java8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsExamples {

    public static void main(String[] args) {
/*******************/
        /*Stream stream = Stream.of(1,2,3,4,5);
        stream.forEach(i->System.out.println(i));
        stream.forEachOrdered(i->System.out.println(i));*/
/*******************/
       /* List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream1 = list.stream();
        Integer[] evenNumbersArr = stream1.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);*/
/*******************/
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().sorted((a,b)->b.compareTo(a)).map(a->a.toLowerCase()).filter(a->(a.startsWith("a") || a.startsWith("l"))).forEach(System.out::println);


        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);

    }
}
