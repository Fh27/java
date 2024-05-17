package Collections;

import java.util.*;

public class eighty91 {
    public static void main(String[] args) {
        List<String> List= Arrays.asList("Deer","Zebra","Lion");
        System.out.println(List);
        desc(List);
        System.out.println(List);
    }
    public static void desc(List<String> stringList){
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(0)==o2.charAt(0)){
                    return 0;
                }
                else if (o1.charAt(0)>o2.charAt(0)){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
    }
}
