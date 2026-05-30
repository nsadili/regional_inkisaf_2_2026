package topic9;

import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 6, 8);
        // List<Integer> numbers = List.of(3, 7, 1);

        // System.out.println(numbers.stream().allMatch(n -> n > 0));
        // System.out.println(numbers.stream().noneMatch(n -> n % 2 == 0));
        // System.out.println(numbers.stream().anyMatch(n -> n % 2 != 0));

        Stream<Integer> integerStream = Stream.generate(
                () -> new Random().nextInt()).limit(20);

        // integerStream.forEach(el -> System.out.println(el));
        // var say = integerStream
        // .filter(el -> el > 0)
        // // .forEach(System.out::println); // method references
        // .count();

        // System.out.println(say);

        // integerStream
        // .filter(el -> el > 0)
        // .map(el -> el % 10)
        // .forEach(System.out::println); // method references

        var res = List.of(124, 354, 3465, 7676, 2324, 56768, 789, 3432).stream()
                .filter(el -> el % 2 == 0) // cutleri filter edirik
                .map(el -> el % 10)
                .sorted((el1, el2) -> el2.compareTo(el1))
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
