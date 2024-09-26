package Chapter7;

class TwoDShape {
    private double width;
    private double height;

    // 默认构造函数
    TwoDShape() {
        width = height = 0.0;
    }

    TwoDShape(double x) {
        width = height = x;
    }

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

    Triangle() {
        super();
        style = "none";
    }

    Triangle(double x) {
        super(x);
        style = "filled";
    }

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

class ColorTriangle extends Triangle {
    private final String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color is " + color);
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
        Triangle t1 = new Triangle(4.0);
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle();

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

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
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

class ShapesDemo {
    public static void main(String[] args) {
        ColorTriangle t1 =
                new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 =
                new ColorTriangle("Red", "filled", 4.0, 2.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " + t2.area());
    }
}
