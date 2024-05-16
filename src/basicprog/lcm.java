package basicprog;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fir=sc.nextInt();
        int sec=sc.nextInt();
        int fact=0;
        for(int i=1;i<fir+sec;i++){
            fact=fir*i;
            if(fact%sec==0) {
                fact = i;
                break;
            }    }
            System.out.println(fact*fir);

    }
}
