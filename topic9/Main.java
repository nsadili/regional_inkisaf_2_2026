package topic9;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        AFuncInt instance1 = new AFuncInt() {
            public void apply(String str) {
                System.out.println("Inside apply method: " + str);
            };
        };

        AFuncInt instance2 = str -> System.out.println("Inside apply method of lambda: " + str);

        // AFuncInt.print("Salam");
        // instance1.print("Salam", "Gence");
        // instance1.apply("Salam");

        // instance2.print("Hello", "Ganja");
        // instance2.apply("Hi");

        // AnotherFuncInt isEven = (n) -> n % 2 == 0;

        // System.out.println(isEven.test(5));
        // System.out.println(isEven.test(100));

        // NumberOperation factorial = (n) -> {
        // int f = 1;
        // for (int i = 1; i <= n; i++)
        // f *= i;
        // return f;
        // };

        // System.out.println(factorial.apply(5));

        // Random rand = new Random();
        // Supplier<Integer> randomDiceRoll = () -> rand.nextInt(6) + 1;
        // System.out.println(randomDiceRoll.get());

        // Function<Integer, Long> factorial = (n) -> {
        // long f = 1;
        // for (int i = 1; i <= n; i++)
        // f *= i;
        // return f;
        // };

        // System.out.println(factorial.apply(20));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = isEven.negate();

        System.out.println(isEven.test(5));
        System.out.println(isOdd.test(5));
    }
}
