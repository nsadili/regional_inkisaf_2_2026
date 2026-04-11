import java.util.Random;
import java.util.Scanner;

public class MultiDimRandomFill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random(42);

        System.out.print("Please enter #rows: ");
        int rows = scan.nextInt();
        System.out.print("Please enter #cols: ");
        int cols = scan.nextInt();

        int[][] arr = new int[rows][cols];

        // fill array with random ints[0-10]
        for (int rowNo = 0; rowNo < arr.length; rowNo++) {// OUTER LOOP
            for (int colNo = 0; colNo < arr[rowNo].length; colNo++) // INNER LOOP
                arr[rowNo][colNo] = rand.nextInt(11);
        }

        // print elements
        // for (int rowNo = 0; rowNo < arr.length; rowNo++) {// OUTER LOOP
        // for (int colNo = 0; colNo < arr[rowNo].length; colNo++) // INNER LOOP
        // System.out.print(arr[rowNo][colNo] + " ");
        // System.out.println();
        // }

        for (int[] row : arr) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
