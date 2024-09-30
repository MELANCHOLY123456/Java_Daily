package Chapter12.Transport_Test;

public enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private final int speed;

    Transport(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }
}
