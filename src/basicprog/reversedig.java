package basicprog;

import java.util.Scanner;

public class reversedig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int newnum=0;
        while(num!=0){
            int r=num%10;
            newnum=newnum*10+r;
            num=num/10;
        }
        System.out.println(newnum
        );
    }
}
