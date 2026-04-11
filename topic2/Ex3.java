import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, counter = 0;
        long sum = 0;
        System.out.print("Enter next number -> ");

        while (scan.hasNextInt()) {
            n = scan.nextInt();
            System.out.println("->" + n);
            sum += n;
            counter++;
            System.out.print("Enter next number -> ");
        }

        System.out.println(counter);
        System.out.println(sum);

        if (counter > 0) {
            float average = (float) sum / counter;
            System.out.println(average);
        }

        
        scan.close();
    }
}
