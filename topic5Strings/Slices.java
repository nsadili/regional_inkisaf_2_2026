package topic5Strings;

public class Slices {
    public static void main(String[] args) {

        String word = "mahammadali musayev";

        for (int i = 0; i < word.length(); i++)
            System.out.println(word.substring(0, i) + " " + word.substring(i));
        
        // System.out.println(word.substring(0, 1) + " " + word.substring(1));
        // System.out.println(word.substring(0, 2) + " " + word.substring(2));
        // System.out.println(word.substring(0, 3) + " " + word.substring(3));

    }
}
