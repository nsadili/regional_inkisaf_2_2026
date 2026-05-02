package topic7Exceptions;

import topic3OOP.Point;

public class ExceptionsDemo {
    public static void main(String[] args) {

        int arr[] = new int[] { 0, 5, 3, 4, 5, 6 };

        Point p = new Point();

        try {
            int a = arr[0]; // 0
            int b = arr[3]; // 4

            p.getX();

            int res = b / a;
            System.out.println(res);
        } catch (ArithmeticException ex) {
            System.out.println("Sifira bolmek olmaz");
            System.out.println(ex.getMessage());
            return;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            // System.out.println(ex.getMessage());
            System.out.println("Nese xeta bas verdi");
        } finally {
            // executes whether or not an exception is thrown
            System.out.println("the rest of the program");

            // cleanup
        }

    }
}
