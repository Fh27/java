package pattterns;

public class pyramid {
    public static void main(String[] args) {
        int n=5;
        //spaces
//        for (int i = 0; i < n; i++) {
//
//        for (int j = 0; j <n-i-1 ; j++) {
//            System.out.print(" ");
//
//        }
//        //stars
//        for (int j = 0; j < 2*i+1; j++) {
//            System.out.print("* ");
//
//        }
//        //spaces
//        for (int j = 0; j < n-i-1; j++) {
//            System.out.print(" ");
//
//        }
//            System.out.println();
//        }
        for (int i = 0; i < n; i++) {
                //spaces
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            //stars
            char ch='A';
            int breakpoint=(2*i+1)/2;
//            System.out.println(breakpoint);
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch+" ");

                if(j<=breakpoint) ch++;
                else ch--;

            }
            //spaces
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
