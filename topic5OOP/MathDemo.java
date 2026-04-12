package topic5OOP;

public class MathDemo {
    public static int min(int a, int b) {
        System.out.printf("Inside min(%d, %d) method\n", a, b);
        return a > b ? b : a;
    }

    public static int min(int a, int b, int c) {
        System.out.printf("Inside min(%d, %d, %d) method\n", a, b, c);
        return min(min(a, b), c);
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int sum(int[] arr) {
        System.out.println("Inside sum(int[]) method");
        if (arr == null)
            return 0;

        int s = 0;
        for (var el : arr)
            s += el;
        return s;
    }

    public static double sum(double[] arr) {
        System.out.println("Inside sum(double[]) method");
        if (arr == null)
            return 0;

        double s = 0;
        for (var el : arr)
            s += el;
        return s;
    }
}
