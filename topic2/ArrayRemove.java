import java.util.Arrays;

public class ArrayRemove {
    public static void main(String[] args) {

        // [3,2,5,7,3,5]
        // 3, 2, 5, 3, 7
        int[] ededler = new int[] { 3, 2, 5, 7, 3, 7 };
        // 0 1 2 3 4 5

        int idxToRemove = 3;
        int len = ededler.length;
        for (int i = idxToRemove; i < len - 1; i++) {
            ededler[i] = ededler[i + 1];
        }
        ededler[len - 1] = 0;

        System.out.println(Arrays.toString(ededler));
    }
}