package basicprog;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            int num=sc.nextInt();

if(num >0){
    long fact=1;
    if(num<2 && num>=0){
        fact=1;
    }
    for(int i=2;i<=num;i++){
        fact=fact*i;
    }
    System.out.println(fact);
}else{
    System.out.println("enter +ve");

}
}

}
