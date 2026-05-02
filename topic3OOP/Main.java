package topic3OOP;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person p = new Person();

        int age = scan.nextInt();
        boolean res = p.setAge(age);
        while (!res) {
            age = scan.nextInt();
            res = p.setAge(age);
        }

        // p.username = "nsa";
        System.out.println(p.getAge());

        scan.close();
    }
}
