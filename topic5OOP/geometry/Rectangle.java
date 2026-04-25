package topic5OOP.geometry;

//duzbucaqli
public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(String name, String color, boolean isFilled,
            int width, int length) {
        super(name, color, isFilled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean isFilled,
            int width, int length) {
        // super("rect", color, isFilled);
        // this.width = width;
        // this.length = length;
        this("rect", color, isFilled, width, length);
    }

    public Rectangle(String color, int width, int length) {
        this("rect", color, false, width, length);
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return "Rectangle [width=" + width +
                ", length=" + length +
                ", " + super.toString() +
                "]";
    }

}
