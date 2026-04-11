import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int nBck = n;
        n = Math.abs(n); // n-i absolute value ile evez edirik

        int sum = 0, d; // initialization
        while (n > 0) { // condition
            d = n % 10;
            System.out.println(d);
            sum = sum + d; //sum += d;
            n = n / 10; //n /= 10 // update
        }

        System.out.printf(
                "Sum of %d = %d\n", nBck, sum);

        scan.close();
    }
}
// concatenate
/*
 * 
 * -346
 * 3
 * 4
 * 6
 * 
 */