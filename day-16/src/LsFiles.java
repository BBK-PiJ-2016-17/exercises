/**
 * Day 16
 * Ex 1 - ls
 *
 * Write a program that shows on screen the names of the files in the current
 * directory. (Hint: look at methods from class File).
 *
 * @author Ginestra Ferraro
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LsFiles {

    public static void main(String[] args) {
        LsFiles listThemAll = new LsFiles();
        listThemAll.launch();
    }

    // Option 1

    public void launch() {

        File here = new File("/Users/ginestra/Dropbox/MSc/MSc-PiJ-16-17" +
                "/exercises/day-16/src");

        String[] files = here.list();

        try {

            for (String file : files) {
                System.out.println(file);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    // Option 2

//    public void launch() throws IOException {
//
//        File here = new File("/Users/ginestra/Dropbox/MSc/MSc-PiJ-16-17" +
//                "/exercises/day-16/src");
//        String[] files = here.list();
//
//        for (String file : files) {
//            System.out.println(file);
//        }
//
//    }
}