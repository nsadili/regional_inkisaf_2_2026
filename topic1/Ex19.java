package topic1;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int nBck = n;
        n = Math.abs(n); // n-i absolute value ile evez edirik

        if(   n < 100 || n > 999   ){ //!(  n >= 100 && n <= 999
            System.out.println("This is not a 3-digit number");
            System.exit(1);
        }

        if (n < 0) {
            // System.out.println("n is negative");
            // System.exit(1);
            n = -n;
        }

        int yuzluk = n / 100;// 346 / 100 => 3
        int onluq = n / 10 % 10; // 346 / 10 => 34 % 10 => 4
        int teklik = n % 10; // 346 % 10 => 6

        // -346 ədədinin rəqəmlərinin cəmi 13.
        System.out.println(nBck + " ədədinin rəqəmlərinin cəmi " + (yuzluk + onluq + teklik));
        //TODO:  find and print product and average

        scan.close();
    }
}
//concatenate
/*
 * 
 * -346
 * 3
 * 4
 * 6
 * 
 */