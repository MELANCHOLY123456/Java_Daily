package Chapter12.TrafficLightColor_Test;

public enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private final int delay;

    TrafficLightColor(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }

    public TrafficLightColor next() {
        return switch (this) {
            case GREEN -> YELLOW;
            case YELLOW -> RED;
            default -> GREEN;
        };
    }
}
