package Chapter12.staticImport_Test;

public class Quadratic_01 {
    public static void main(String[] args) {
        double a, b, c, x;
        a = 4;
        b = 1;
        c = -3;

        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        // Find second solution.
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}
