package Chapter12.TrafficLightColor_Test;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thread = new Thread(tl);
        thread.start();
        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
