package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * Created by ginestra on 07/06/2017.
 */
public class Lambdas_02_02 {
    public static void main(String[] args) {

        Arrays.asList("red", "green", "blue")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // Example of Stream.of with a filter
        Stream.of("apple", "pear", "banana", "cherry", "apricot")
                .filter(fruit -> {
                    // System.out.println("filter: " + fruit);
                    return fruit.startsWith("a");
                })
                // If the foreach is removed, nothing will print.
                // the foreach makes it a terminal event
                .forEach(fruit -> System.out.println("Starts with A: " +
                        fruit));

        // Using a stream and map operation to create a list of words in caps
        List<String> collected = Stream.of("Java", " rocks")
                .map(string -> string.toUpperCase())
                .collect(toList());
        System.out.println(collected.toString());
    }
}
