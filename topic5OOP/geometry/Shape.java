package topic5OOP.geometry;

public abstract class Shape {
    private String name;
    private String color;
    private boolean isFilled;

    public Shape(String name, String color, boolean isFilled) {
        this.name = name;
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
        return "Shape [name=" + name + ", color=" + color + ", isFilled=" + isFilled + "]";
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
