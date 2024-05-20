package pattterns;

public class binaryprintingstar {
    public static void main(String[] args) {
        int n=4;
        int strt=1;
        for (int i = 0; i < n; i++) {


            if(i%2==0) strt=1;
            else strt=0;
            for (int j = 0; j < i; j++) {
                System.out.print(strt+ " ");
                strt=1-strt;
            }
            System.out.println();
        }

    }
}
