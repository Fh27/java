package threads;

public class testing3 {
    public static void main(String[] args) throws InterruptedException {
        threethreadchallenge t1=new threethreadchallenge(1);
        threethreadchallenge t2=new threethreadchallenge(2);
        threethreadchallenge t3=new threethreadchallenge(3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

        System.out.println("ended");
    }
}
