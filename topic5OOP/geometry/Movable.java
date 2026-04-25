package topic5OOP.geometry;

public interface Movable {

    double DEFAULT_STEP = 5;

    void moveUp(double step);

    void moveDown(double step);

    void moveLeft(double step);

    void moveRight(double step);

    default int update(int a) {
        return a * 2;
    }

    static void sayHello() {
        System.out.println("Hello from the Movable");
    }

}
