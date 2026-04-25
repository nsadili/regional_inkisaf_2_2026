package topic6OOP;

import java.awt.Shape;

import topic3OOP.Point;
import topic3OOP.Segment;
import topic5OOP.geometry.Circle;
import topic5OOP.geometry.Movable;
import topic5OOP.geometry.Rectangle;
import topic5OOP.geometry.Square;

public class InterfacesDemo {
    public static void main(String[] args) {
        // Rectangle r1 = new Rectangle("red", 5, 10);
        // Square s1 = new Square("yellow", 12);

        Circle c1 = new Circle("myCircle", "pink", false, new Point(2, 3), 3.0);
        Point p1 = new Point(5, 5);
        Segment seg1 = new Segment(0, 0, 3, 4);

        var arr1 = new Movable[] { c1, p1, seg1 };
        moveAll(arr1, Direction.DOWN);
        var arr2 = new Movable[] { c1, p1, seg1 };
        printAll(arr2);
    }

    private static void moveAll(Movable[] arr, Direction dir) {
        for (Movable obj : arr)
            switch (dir) {
                case UP:
                    obj.moveUp(Movable.DEFAULT_STEP);
                    break;
                case DOWN:
                    obj.moveDown(Movable.DEFAULT_STEP);
                    break;
                case LEFT:
                    obj.moveLeft(Movable.DEFAULT_STEP);
                    break;
                case RIGHT:
                    obj.moveRight(Movable.DEFAULT_STEP);
                    break;
                default:
                    break;
            }

    }

    private static void printAll(Movable[] arr) {
        for (Movable s : arr)
            System.out.println(s.toString());

    }
}
