package basicprog;

import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num +" * " +i +" = "+ num*i);
        }
    }
}
