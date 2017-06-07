package Lambdas_01;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/**
 * Created by ginestra on 07/06/2017.
 */
public class LambdaMethod {
    public static void main(String[] args) {
        IntFunction<String> intToString = num -> Integer.toString(num);
        System.out.println("Expected value 3, actual value " + intToString
                .apply(123).length());

        // Static method reference using ::
        IntFunction<String> intToString2 = Integer::toString;
        System.out.println("Expected value 4, actual value " +
                intToString2.apply(4567).length());

        // Lambdas made using a constructor
        Function<String, BigInteger> newBigInt = BigInteger::new;
        System.out.println("Expected value 123456789, actual value " +
                newBigInt.apply("123456789"));

        // Example of a lambda made from an instance method
        Consumer<String> print = System.out::println;
        print.accept("Coming to you directly from a lambda...");

        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("Gi"));
    }
}
