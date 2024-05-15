package Generics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetUnique {
    public static void main(String[] args) {
        Set<Character> ss=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        String in=sc.next();
        for (char c : in.toCharArray()) {
            ss.add(c);
        }
        System.out.println("youyr string has "+ss.size());
    }
}
