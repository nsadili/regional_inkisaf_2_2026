public class MultiDim {
    public static void main(String[] args) {

        // int[][] arr = new int[3][4];
        int[][] arr = new int[][] {
                { 2, 3, 4, 6 },
                { 1, 2, 3, 4 },
                { 0, 2, 7, 4 } };

        for (int rowNo = 0; rowNo < arr.length; rowNo++) {// OUTER LOOP
            // rowNo-ci setri cap et
            for (int colNo = 0; colNo < arr[rowNo].length; colNo++) // INNER LOOP
                System.out.print(arr[rowNo][colNo] + " ");
            System.out.println();
        }

        System.out.println("Allaha sukur bitdi");
    }
}
