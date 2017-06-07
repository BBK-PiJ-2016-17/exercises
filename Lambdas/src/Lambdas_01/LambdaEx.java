package Lambdas_01;

import java.util.function.*;

/**
 * Created by ginestra on 07/06/2017.
 */
public class LambdaEx {
    public static void main(String[] args) {
        // Using the test method of Predicate
        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("Apple") + " - Apples is less than " +
                "10");

        // Consumer example uses accept method
        Consumer<String> consumerStr = (s) -> System.out.println(s
                .toLowerCase());
        consumerStr.accept("ABCDefghijklmnopQRSTuvWxyz");

        // Function example
        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println("length of 26: " + converter.apply(26).length());

        // Supplier example
        Supplier<String> s = () -> "Java is fun";
        System.out.println(s.get());

        // Binary operator example
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Add 10 + 25: " + add.apply(10, 25));

        // Unary operator example
        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println("My message in a bottle will be in upper case: " +
                str.apply("help!"));
    }
}
