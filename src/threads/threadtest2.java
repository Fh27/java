package threads;

public class threadtest2 {
    public static void main(String[] args) throws InterruptedException {
        threadsleep t1=new threadsleep();
        System.out.println(t1.getState());
        t1.start();
        t1.join();
        System.out.println(t1.getState());
    }
}
