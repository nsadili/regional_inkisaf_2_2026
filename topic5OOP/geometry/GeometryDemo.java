package topic5OOP.geometry;

public class GeometryDemo {
    public static void main(String[] args) {

        var r1 = new Rectangle("red", 5, 10);
        var r2 = new Rectangle("myRect", "brown", true, 3, 7);

        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println();

        var sq1 = new Square("yellow", 12);
        var sq2 = new Square("cell", "yellow", true, 12);

        System.out.println(sq1);
        System.out.println(sq2);

    }
}
