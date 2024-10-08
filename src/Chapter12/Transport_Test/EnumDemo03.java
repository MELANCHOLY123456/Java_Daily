package Chapter12.Transport_Test;

public class EnumDemo03 {
    public static void main(String[] args) {
        Transport tp;

        // Display speed of an airplane.
        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.\n");

        // Display all Transports and speeds.
        System.out.println("All Transport speeds: ");
        for (Transport t : Transport.values()) {
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
        }
    }
}
