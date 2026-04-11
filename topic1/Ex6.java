package topic1;

public class Ex6 {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Qardas nagarsan?!");
            System.exit(-1); // stop the program
        }
        int a = Integer.parseInt(args[0]); // "5" -> int 5
        int b = Integer.parseInt(args[1]); // "14" -> int 14

        int res = a + b;
        // System.out.printf("The result is %d\n", res);
        // System.out.println(a + " + " + b + " = " + res);
        System.out.printf(
                "%d + %d = %d\n",
                a, b, res);
    }
}
