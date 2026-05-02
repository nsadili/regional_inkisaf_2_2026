package topic3OOP;

import java.util.Scanner;

public class MainGeo {
    public static void main(String[] args) {
        // new Point() -> OBJECT
        // Point -> TYPE
        // p1 -> REFERENCE
        Point p1 = new Point(); // default constructor
        Point p2 = new Point();
        Point p3 = new Point(14, 18);
        Point p4 = p3; // copy reference
        Point p5 = new Point(p3); // copy object

        int x = 234; // PRIMITIVE

        // p1.setX(10);
        // p1.setY(10);

        p1.translate(3, 5); // (3,7) -> (6,12)

        // p3.setX(100);
        System.out.println(p1.toString());
        // System.out.println(p2.toString());
        // System.out.println(p3.toString());
        // System.out.println(p4.toString());
        // System.out.println(p5.toString());

        System.out.println(p1.distance(p5));

        System.out.println(p3.equals(p4));
        System.out.println(p4.equals(p5));
        System.out.println(p4.equals(p1));
        

    }
}
