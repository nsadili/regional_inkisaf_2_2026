package topic7Exceptions;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        // System.out.println(factorial(Long.parseLong(args[0])));
        System.out.println(power(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

    }

    static long factorial(int a) {
        long f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }

    static BigInteger factorial(long n) {
        BigInteger f = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    static BigInteger power(int base, int power) {
        BigInteger exp = BigInteger.ONE;
        BigInteger baseBig = BigInteger.valueOf(base);
        for (int i = 1; i <= power; i++)
            exp = exp.multiply(baseBig);
        return exp;
    }
}
