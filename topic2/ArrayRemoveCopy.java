import java.util.Arrays;

public class ArrayRemoveCopy {
    public static void main(String[] args) {

        int[] ededler = new int[] { 3, 2, 5, 7, 3, 7 };
        int[] copy = new int[ededler.length - 1];

        int idxToRemove = 3; // ask user about it

        for (int i = 0, idxToCopy = 0; i < copy.length; i++) {
            if (i == idxToRemove)
                continue;

            copy[i] = ededler[idxToCopy++];

            // if (i < idxToRemove)
            // copy[i] = ededler[i];
            // else
            // copy[i] = ededler[i + 1];
        }

        System.out.println(Arrays.toString(ededler));
        System.out.println(Arrays.toString(copy));
    }
}