package topic5Strings;

import java.util.Arrays;

public class MixedString {
    public static void main(String[] args) {

        String cumle = "This is PP2 Fall 2021";

        var res = tokenize(cumle, " ");

        for (int i = 0; i < res.length; i++) {
            res[i] = swapFirstAndLast(res[i]);
        }

        String yeniCumle = String.join(" ", res);
        System.out.println(yeniCumle);

    }

    static String[] tokenize(String str, String delimiter) {
        // " "
        if (str == null) {
            return new String[0]; // null
        }
        String[] parts = str.split(delimiter);
        return parts;
    }

    /**
     * Swap the first and the last chars of the given string
     * 
     * @param word
     * @return String
     */
    static String swapFirstAndLast(String word) {
        // T hi s
        // s hi T
        if (word == null)
            return null;
        if (word.length() <= 1)
            return word;

        char[] characters = word.toCharArray();
        char tmp = characters[0]; // T
        characters[0] = characters[characters.length - 1]; // s
        characters[characters.length - 1] = tmp; // T

        // return new String(characters);
        return String.valueOf(characters);
        // return Arrays.toString(characters);
    }
}

// "abc def"

// reverse: "fed cba"
// cba fed