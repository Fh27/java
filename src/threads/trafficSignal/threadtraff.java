package threads.trafficSignal;

public class threadtraff extends Thread{
private  final trafficColor color;

    public threadtraff(trafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println("Active"+color);
        try {
            Thread.sleep(color.getTime());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Inactive"+color);
    }
}
