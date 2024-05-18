package pattterns;

public class incletter {
    public static void main(String[] args) {
        int n=4;
        char sum='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();}
    }
}
