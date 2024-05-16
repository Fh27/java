package basicprog;

import java.util.Scanner;

public class oddnumbersN {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                int sum=0;
                for(int i=1;i<=num;i+=2){
                    sum+=i;
                    System.out.println(i);
                }
        System.out.println("sum is"+sum);
    }
}
