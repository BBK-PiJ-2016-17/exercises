/**
 * Day 16
 * Ex 2 - mkdir
 *
 * Write a program that takes a name from the user at the command line and
 * creates a directory with that name.
 * Remember that the only argument of method main is an array of Strings, each
 * of them an argument written after the name of the class. For example, if you
 * write java myClass this That 0, the elements in args will be three strings of
 * values “this”, “That”, and “0”.
 *
 * @author Ginestra Ferraro
 */

import java.io.File;

public class CreateDirectory {

    public static void main(String[] args) {
        CreateDirectory newDir = new CreateDirectory();
        newDir.launch();
    }

    public void launch() {

        System.out.print("What name shall the new directory be called? ");

        String newName = System.console().readLine();

        System.out.println("A new folder " + newName + " has been created.");

        File newFolder = new File("/Users/ginestra/Dropbox/MSc/MSc-PiJ-16-17" +
                "/exercises/day-16/src/" + newName);

        newFolder.mkdir();
    }

}
