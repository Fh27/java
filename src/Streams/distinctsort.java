package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class distinctsort {
    public static void main(String[] args) {
        List<Integer> ls= List.of(1,23,4,4,5,6,6,788);
        List<Integer> lsls=ls.stream().distinct().sorted((x,y)->x-y).collect(Collectors.toList());
        System.out.println(lsls);
    }

}
