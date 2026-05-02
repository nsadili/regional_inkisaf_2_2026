package topic7Exceptions;

public class CatchOrSpecify {
    public static void main(String[] args) {

        try {
            System.out.println(div(3, 0));
            // } catch (IllegalArgumentException ex) {
            // ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("The rest of the program");
    }

    static int div(int a, int b) throws Exception {
        // catch
        // specify

        if (b == 0)
            throw new IllegalArgumentException("Sifira bolmek olmaz");

        return a / b;
    }
}
