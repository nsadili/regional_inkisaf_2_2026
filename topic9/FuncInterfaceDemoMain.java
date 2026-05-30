package topic9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FuncInterfaceDemoMain {
    public static void main(String[] args) {

        List<String> fruits = List.of("orange", "tangerine", "apple", "peach", "pear");

        Predicate<String> startsWithP = str -> str.startsWith("p");
        Predicate<String> longerThan5 = str -> str.length() > 5;

        // processStrings(fruits, startsWithP);
        // processStrings(fruits, longerThan5);
        // processStrings(fruits, str -> str.length() <= 4);

        List fruitsLessThan5 = filterStrings(fruits, str -> str.length() <= 4);
        System.out.println(fruitsLessThan5);
    }

    static void processStrings(List<String> list, Predicate<String> filter) {
        for (String el : list) {
            if (filter.test(el))
                System.out.println(el);
        }
    }

    static List<String> filterStrings(List<String> list, Predicate<String> filter) {
        List<String> filteredList = new ArrayList<>();

        for (String el : list) {
            if (filter.test(el))
                filteredList.add(el);
        }

        return filteredList;
    }
}
