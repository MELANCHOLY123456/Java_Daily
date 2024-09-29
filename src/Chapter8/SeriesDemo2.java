package Chapter8;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos obj_two = new ByTwos();
        ByThrees obj_three = new ByThrees();
        Series obj;

        for (int i = 0; i < 5; i++) {
            obj = obj_two;
            System.out.println("Next ByTwos value is " + obj.getNext());
            obj = obj_three;
            System.out.println("Next ByThrees value is " + obj.getNext());
        }
    }
}
