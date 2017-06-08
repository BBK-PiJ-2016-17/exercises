
package file_io;
import java.util.Scanner;
import java.io.*;
public class CustomerNames {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File output = new File("customers.txt"); // It will create a new file
        String name;
        System.out.println("Enter the first customer name: ");
        name = in.nextLine();
        try {
            PrintWriter out = new PrintWriter(output);
            while (name.equalsIgnoreCase("done")==false) {
                out.println(name);
                System.out.println("Enter the next name or \"done\" to exit.");
                name = in.nextLine();
            }
            out.close(); // we can avoid this using try withResources
        } catch(Exception e) {
            System.out.println("Error encountered " + e.toString());
        }
    }
}
