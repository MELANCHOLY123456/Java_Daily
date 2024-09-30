package Chapter13.Gen_Test;

public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showTypes();

        // Obtain and show values.
        int v = tgObj.get_ob1();
        System.out.println("value: " + v);

        String str = tgObj.get_ob2();
        System.out.println("value: " + str);
    }
}
