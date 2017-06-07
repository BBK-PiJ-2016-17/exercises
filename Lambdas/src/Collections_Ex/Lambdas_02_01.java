package Collections_Ex;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by ginestra on 07/06/2017.
 */
public class Lambdas_02_01 {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Paul", "Jane", "Michaela", "Sam");

        // Way to sort prior to Java 8 lambdas
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        // First iteration with lambda
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        // Now remove the data types and allow the compiler to infer the type
        Collections.sort(names, (a, b) -> b.compareTo(a));

        // Total pages in your book collection
        Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
                "Ranson", "Riggs", 382);
        Book book2 = new Book("Harry Potter and The Sorcerers Stone", "JK",
                "Rowling", 411);
        Book book3 = new Book("The Cat in the Hat", "Dr", "Seuss", 45);

        // Use .collect to aggregate values
        List<Book> books = Arrays.asList(book1, book2, book3);
        int total = books.stream()
                .collect(Collectors.summingInt(Book::getPages));
        System.out.println(total);

        // Use .collect to aggregate author first names into a list
        // and .map to get the last name of the author

        List<String> list = books.stream()
                .map(Book::getAuthorFName)
                .collect(Collectors.toList());
        System.out.println(list);

        // Create a list with duplicates
        List<Book> dupBooks = Arrays.asList(book1, book2, book3, book1, book2);
        System.out.println("Before removing duplicates: ");
        System.out.println(dupBooks.toString());

        // Remove duplicates using a Set
        Collection<Book> noDupBooks = new HashSet<>(dupBooks);
        System.out.println("After removing duplicates: ");
        System.out.println(noDupBooks.toString());

        // Example of using Set to eliminate dups and sort automatically
        Set<Integer> numbers = new HashSet<>(Arrays.asList(4, 3, 3, 3, 2, 1,
                1, 1));
        System.out.println(numbers.toString());
    }
}
