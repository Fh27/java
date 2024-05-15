package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class swapingList {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 343, 4, 4, 5, 65, 6, 7);
        System.out.println(ls);
        swapp(ls, 2, 3);
        System.out.println(ls);
        Collections.reverse(ls);
        System.out.println(ls);


    }
        public static void swapp(List<Integer> list,int x,int y){
            int t=list.get(x);
            list.set(x,list.get(y));
            list.set(y,t);
        }
    }

