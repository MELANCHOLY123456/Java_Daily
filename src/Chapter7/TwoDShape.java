package Chapter7;

class TwoDShape {
    double width;
    double height;

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

class Triangle extends TwoDShape {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends TwoDShape {
    boolean isSquare() {
        return width == height;
    }

    double area() {
        return width * height;
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        System.out.println();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.width = 5.0;
        r1.height = 5.0;

        r2.width = 4.0;
        r2.height = 7.0;

        System.out.println("Info for r1: ");
        r1.showDim();
        System.out.println("Is square? " + r1.isSquare());
        System.out.println("Area is " + r1.area());
        System.out.println();

        System.out.println("Info for r2: ");
        r2.showDim();
        System.out.println("Is square? " + r2.isSquare());
        System.out.println("Area is " + r2.area());
    }
}
