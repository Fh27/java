package basicprog;

import java.util.Scanner;

public class numberPalin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        boolean isPalindrome=IsPalindrome(num);
        if(isPalindrome) System.out.println("palindrome");
        else System.out.println("not palindrome");

    }
    public static boolean IsPalindrome(int n){
        int neww=0;
        int x=n;
        while(x>0){
            int r=x%10;
            neww=neww*10+r;
            x=x/10;
        }
        if(neww==n){
      return true
      ;
        }else{
        return false;
    }}
}
