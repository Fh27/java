package basicprog;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fir=sc.nextInt();
        int sec =sc.nextInt();

int GCD=gcdd(fir,sec);
        System.out.println(GCD);
    }
    public static int gcdd(int x,int y){
        int gdc=1;
        int i=2;
        int least =least(x,y);
        while(i<=least){
            if(x%least==0 && y%least==0){
                gdc=i;
            }
            i++;
        }
        return gdc;
    }
    public static int least(int x,int y){
        if(x<y)return x;
        else return y;
    }
}
