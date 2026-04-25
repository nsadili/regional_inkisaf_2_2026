package topic6OOP;

import topic3OOP.Point;
import topic5OOP.geometry.Circle;
import topic5OOP.geometry.Movable;
import topic5OOP.geometry.Rectangle;
import topic5OOP.geometry.Square;
import topic5OOP.geometry.Shape;

public class PolymorphismDemo {
    public static void main(String[] args) {

        // Abstract classes cannot be instantiated
        // new Shape("a", "b", true);

        Rectangle r1 = new Rectangle("red", 5, 10);
        Rectangle r2 = new Rectangle("myRect", "brown", true, 3, 7);

        Rectangle sq1 = new Square("yellow", 12);
        Rectangle sq2 = new Square("cell", "yellow", true, 12);

        Circle c1 = new Circle("myCircle", "pink", false, new Point(2, 3), 3.0);

        // System.out.println(sumAreas(
        // new Shape[] { sq1, sq2, r1, r2, c1 }));

        c1.moveUp(3);
        c1.moveLeft(5);
        System.out.println(c1.toString());

        System.out.println(Movable.DEFAULT_STEP);

        System.out.println(c1.update(10));
        Movable.sayHello();

    }

    static double sumAreas(Shape[] shapes) {
        double sumAreas = 0;

        for (Shape shape : shapes) {
            var area = shape.getArea();
            System.out.println(area);
            sumAreas += area;
        }

        return sumAreas;
    }
}
