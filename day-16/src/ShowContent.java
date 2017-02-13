/**
 * Day 16
 * Ex 3 - cat
 *
 * a) Write a program that takes a name from the user at the command line. If
 * a file with that name exists, the program must show its contents on screen
 * . If it does not, the program must say so.
 *
 * b) (*)
 * Modify the program so that it takes many file names at the command line, and
 * then shows them all one after the other.
 *
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowContent {

    public static void main(String[] args) {
        ShowContent openIfExists = new ShowContent();

        String thisFile = null;

        try {
            openIfExists.launch();

            throw new FileNotFoundException(thisFile);
        } catch (FileNotFoundException ex) {
            System.out.println("File " + thisFile + " does not exists.");
            ex.printStackTrace();
        } finally {
            System.out.println("\n--- That's all folks ---\n");
        }
    }

    public void launch() throws FileNotFoundException {

        System.out.print("What file do you want me to open? ");
        String thisFile = System.console().readLine();

        // Loop through the files in this folder and check if any matches the
        // name (need to remove extension?)

        File here = new File("/Users/ginestra/Dropbox/MSc/MSc-PiJ-16-17" +
                "/exercises/day-16/src");

        String[] files = here.list();

        for (String file : files) {

            if (file.equals(thisFile)) {

                System.out.println("\n===== Printing " + thisFile + " =====\n");

                // Show the content of the file
                File userFile = new File(thisFile);
                try (BufferedReader in = new BufferedReader(new FileReader(userFile))) {

                    String line;
                    while ((line = in.readLine()) != null) {
                        System.out.println(line);
                    }

                } catch (FileNotFoundException ex) {
                    System.out.println("File " + thisFile + " does not exist." +
                            " 2");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

}
