package Chapter8;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos obj = new ByTwos();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + obj.getNext());
        }
        System.out.println("\nResetting");
        obj.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + obj.getNext());
        }
        System.out.println("\nStarting at 100");
        obj.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is " + obj.getNext());
        }
    }
}
