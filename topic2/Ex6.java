public class Ex6 {
    public static void main(String[] args) {

        int counter = 1;
        while (counter < 10) {
            double rand = Math.random();
            
            if (rand < 0.125) {
                System.out.println("1");
            } else if (rand < 0.25) {
                System.out.println("2");
            } else {
                System.out.println("ve saire");
            }
            counter++;
        }

    }
}
