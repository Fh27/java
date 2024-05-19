package threads;

public class threadsleep extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println(getState());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
