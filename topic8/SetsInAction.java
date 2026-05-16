package topic8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsInAction {
    public static void main(String[] args) {

        List<String> names = List.of("Ali", "Samir", "Mammad", "Ali");

        // Set<String> uniqueNames = new HashSet<>(names);
        // Set<String> uniqueNames = new LinkedHashSet<>(names);
        Set<String> uniqueNames = new TreeSet<>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            };
        });
        uniqueNames.addAll(names);

        System.out.println(uniqueNames);
    }
}
