/**
 * Implement a simple class that executes the code below in its main method.
 * Change the class AdultPerson for KidPerson and verify that it still compiles
 * and runs.
 *
 * Person son = new AdultPerson();
 * // move in front of mother
 * son.move(10);
 * // give the message
 * son.say("I love you, Mum.");
 */

public class ExercisePerson implements Person {

    public static void main(String[] args) {
        Person son = new AdultPerson();
        // move in front of mother
        son.move(10);
        // give the message
        son.say("I love you, Mum.");
    }
}