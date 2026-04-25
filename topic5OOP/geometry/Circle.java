package topic5OOP.geometry;

import topic3OOP.Point;

public class Circle extends Shape implements Movable {
    private Point center;
    private Double radius;

    public Circle(String name, String color, boolean isFilled,
            Point center, Double radius) {
        super(name, color, isFilled);
        this.center = center;
        this.radius = radius;
    }

    public Circle(String name, String color, boolean isFilled,
            float centerX, float centerY, Double radius) {
        // super(name, color, isFilled);
        // this.center = new Point(centerX, centerY);
        // this.radius = radius;
        this(name, color, isFilled, new Point(centerX, centerY), radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        Movable.sayHello();
        return "Circle [center=" + center.toString() +
                ", radius=" + radius +
                ", " + super.toString() +
                "]";
    }

    public void moveUp(double step) {
        // this.center.translate(0.0f, (float) Math.abs(step));
        this.center.moveUp(step);
    };

    public void moveDown(double step) {
        // this.center.translate(0.0f, -(float) Math.abs(step));
        this.center.moveDown(step);
    };

    public void moveRight(double step) {
        // this.center.translate((float) Math.abs(step), 0.0f);
        this.center.moveRight(step);
    };

    public void moveLeft(double step) {
        // this.center.translate(-(float) Math.abs(step), 0.0f);
        this.center.moveLeft(step);
    };

    public int update(int a) {
        return a * 3;
    };
}
