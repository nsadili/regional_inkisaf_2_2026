class X {
    public X() {
        System.out.println("In constructor X.");
    }
}

class Y {

    static int z; // static - class variable
    private int x; // instance variable - field

    static {
        // static init block
        z = 123;
        System.out.println("In static block 1 of Y " + z);
    }

    {
        // instantiation block
        System.out.println("In inst block 1 of Y");
        // x = 10;
    }

    public Y() {
        System.out.println("In constructor Y.");
        x = 100;
        // z = 5;
        System.out.println();
    }

    public Y(int x) {
        System.out.println("In constructor Y.");
        this.x = x;
        // z = 15;
        System.out.println();
    }

    {
        // instantiation block
        System.out.println("In inst block 2 of Y");
        // x = 1000;
    }

    public int getX() {
        return this.x;
    }

    public int getZ() {
        return z;
    }

    static {
        // static init block
        z = 125;
        System.out.println("In static block 1 of Y " + z);
    }

}

public class Main {
    public static void main(String[] args) {
        Y y1 = new Y();
        Y y2 = new Y(200);

        // Y.z = 1234;

        System.out.println(y1.getX());
        System.out.println(y1.getZ());

        // System.out.println(y2.getX());
        // System.out.println(y2.getZ());
    }
}
