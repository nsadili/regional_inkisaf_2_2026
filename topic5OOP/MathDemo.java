public class MathDemo {
    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int sum(int[] arr) {
        if (arr == null)
            return 0;
        
        int s = 0;
        for (var el : arr)
            s += el;
        return s;
    }
}
