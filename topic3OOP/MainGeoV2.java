package topic3OOP;

public class MainGeoV2 {
    public static void main(String[] args) {

        Point first = new Point();
        Point second = new Point(7, 10);

        Segment s1 = new Segment(first, second);
        Segment s2 = new Segment(0, 0, 8, 6);
    
    
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
