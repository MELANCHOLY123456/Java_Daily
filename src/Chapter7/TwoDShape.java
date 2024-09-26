package Chapter7;

class TwoDShape {
    private double width;
    private double height;

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

class Triangle extends TwoDShape {
    private final String style;

    Triangle(String s, double w, double h) {
        // super()必须是在子类构造函数中执行的第一条语句
        super(w, h);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends TwoDShape {
    Rectangle(double w, double h) {
        // super()必须是在子类构造函数中执行的第一条语句
        super(w, h);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("filled", 4.0, 4.0);
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);

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

        Rectangle r1 = new Rectangle(5.0, 5.0);
        Rectangle r2 = new Rectangle(4.0, 7.0);

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
