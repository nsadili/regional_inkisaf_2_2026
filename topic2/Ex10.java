import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {

        Random random = new Random();

        int c = 1;
        while (c < 20) {
            int die = random.nextInt(6) + 1; // (0,1,2,3,4,5) [0-5] => [1-6]
            System.out.println(die);
            c++;
        }
    }
}
