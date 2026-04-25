package topic3OOP;

import topic5OOP.geometry.Movable;

public class Point implements Movable {

    // FIELDS
    private float x;
    private float y;

    // CONSTRUCTOR
    public Point(float x, float y) {
        if (x < 0 && y > 0) {
            // TODO: do not let object be created
            System.out.println("Ikinci rube icaze verilmir");
        }
        this.x = x;
        this.y = y;
    }

    public Point() {
        // this.x = 3;
        // this.y = 7;
        this(3, 7);
    }

    // COPY CONSTRUCTOR
    public Point(Point oldP) {
        // this.x = oldP.x;
        // this.y = oldP.y;
        this(oldP.x, oldP.y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String toString() {
        return "Point (" + this.getX() + ", " + this.getY() + ")";
    }

    public void translate(float dX, float dY) {
        this.x = this.x + dX;
        this.y += dY;
    }

    public float distance(Point anotherP) {
        // anotherP
        // current object -> this

        return (float) Math.sqrt(Math.pow(this.x - anotherP.x, 2)
                + Math.pow(this.y - anotherP.y, 2));

    }

    public boolean equals(Point anotherP) {
        // anotherP
        // current object -> this
        boolean res = this.x == anotherP.x && this.y == anotherP.y;
        return res;
        // if (res)
        // return true;
        // else
        // return false;
    }

    public void moveUp(double step) {
        this.translate(0.0f, (float) Math.abs(step));
    };

    public void moveDown(double step) {
        this.translate(0.0f, -(float) Math.abs(step));
    };

    public void moveRight(double step) {
        this.translate((float) Math.abs(step), 0.0f);
    };

    public void moveLeft(double step) {
        this.translate(-(float) Math.abs(step), 0.0f);
    };
}