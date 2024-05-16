package basicprog;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
        fibb(num);

    }
    public static void fibb(int n){
        if(n<0) return;
        System.out.println("0 ");
        if(n==0) return ;
        System.out.println("1 ");
        int f=0;
        int s=1;
 while(f+s<=n){
     int t=f+s;
     System.out.println(t+ " ");
     f=s;
     s=t;
 }

    }
}
