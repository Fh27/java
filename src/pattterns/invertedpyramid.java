package pattterns;

import java.util.Scanner;

public class invertedpyramid {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        for (int i = 0; i < n; i++) {
//spaces
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
//stars
            for (int j = 0; j < ((2*n)-((2*i)+1)); j++) {
                System.out.print("* ");
            }
//spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
