public class Ex1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No input provided!");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Negative factorial is not defined!");
            System.exit(2);
        }

        long f = 1;
        int c = 1; // initiation
        while (c <= n) { // condition
            f *= c;
            c += 1; // c++; //update
        }

        System.out.printf("%d! = %d\n", n, f);
    }
}
