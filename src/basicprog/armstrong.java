package basicprog;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int num=input;
        int sum=0;
        while(num>0){
            int r=num%10;
//            System.out.println(r);
            sum+=Math.pow(r,3);
//            System.out.println(sum);
            num=num/10;
        }
        if(sum==input){
            System.out.println("armstrong");
        }else {
            System.out.println("no");
        }
    }
}
