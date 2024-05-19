package threads.trafficSignal;

public enum trafficColor {
    RED(4000),YELLOW(3000),GREEN(5000);

    private final int time;

    public int getTime() {
        return time;
    }

    trafficColor(int time) {
        this.time = time;
    }
}
