package topic1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A ededini daxil edin: ");
        int a = scanner.nextInt();
        System.out.print("B ededini daxil edin: ");
        int b = scanner.nextInt();
        scanner.close();

        int res = a + b;
        System.out.println(res);

    }
}
