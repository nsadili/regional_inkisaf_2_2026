public class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment(float x1, float y1,
            float x2, float y2) {
        Point first = new Point(x1, y1);
        Point second = new Point(x2, y2);
        this(first, second);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void translate(float dX, float dY) {
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment anotherS) {
        return this.p1.equals(anotherS.p1) && this.p2.equals(anotherS.p2)
                || this.p1.equals(anotherS.p2) && this.p2.equals(anotherS.p1);
    }

    public String toString() {
        return "Segment ("
                + "p1: " + p1.toString()
                + ", p2: " + p2.toString()
                + ")";
    }
}
