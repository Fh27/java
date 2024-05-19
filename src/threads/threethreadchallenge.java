package threads;

public class threethreadchallenge extends Thread{
private final int threadnumber;

    public threethreadchallenge(int threadnumber) {
        this.threadnumber = threadnumber;
    }

    @Override
    public void run() {
        System.out.println(threadnumber);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadnumber);
    }
}
