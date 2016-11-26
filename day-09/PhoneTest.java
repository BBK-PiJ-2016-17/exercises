/**
 * Ex 2 - Day 09 / Upcasting, downcasting
 * For this exercise, you will need to use again some classes and interfaces you
 * created last day: Phone, OldPhone, MobilePhone, SmartPhone.
 *
 * 2.1 Start
 * Create a script that builds a new SmartPhone with the line:
 * Smartphone myPhone = new Smartphone();
 * and then uses all its methods.
 */

public class PhoneTest {
    public static void main(String[] args) {
        PhoneTest launcher = new PhoneTest();
        launcher.launch();
    }

    public void launch() {

        SmartPhone myPhone = new SmartPhone("HTC");

        // Testing all SmartPhone methods
        
        // brand
        System.out.println("This phone's brand: " + myPhone.getBrand());

        // call
        myPhone.call("0039 123456");

        // playGame
        myPhone.playGame("This game");

        // browseWeb
        myPhone.browseWeb("News site");

        // findPosition
        myPhone.findPosition("29.979504, 31.1320133,17");
    }
}