package topic8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3, 2, 6, 3, 4, 6, 2, 7, 0);

        // Collections.sort(numbers);
        Comparator<Integer> descendingComp = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            };
        };

        // numbers.sort(new Comparator<Integer>() {
        //     public int compare(Integer o1, Integer o2) {
        //         return o2 - o1;
        //     };
        // });
        numbers.sort(new DescendingComparator());

        System.out.println(numbers);

    }
}

class DescendingComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    };
}
