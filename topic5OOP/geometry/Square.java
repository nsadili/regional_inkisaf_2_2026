package topic5OOP.geometry;

public class Square extends Rectangle {

    public Square(String name, String color, boolean isFilled, int side) {
        super(name, color, isFilled, side, side);
    }

    public Square(String color, boolean isFilled, int side) {
        this("square", color, isFilled, side);
    }

    public Square(String color, int side) {
        this("square", color, false, side);
    }

    public String toString() {
        return "Square [ " + super.toString() + "  ]";
    }

}
