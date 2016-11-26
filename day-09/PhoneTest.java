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
        
        System.out.println();

        // brand
        System.out.println("== Testing getBrand()");
        System.out.println("This phone's brand: " + myPhone.getBrand());
        System.out.println();

        // call
        System.out.println("== Testing call()");
        myPhone.call("0039 123456");
        System.out.println();

        // ringAlarm
        System.out.println("== Testing ringAlarm()");
        myPhone.ringAlarm("Wishlist by Pearl Jam");
        System.out.println();

        // playGame
        System.out.println("== Testing playGame()");
        System.out.println("Im' playing: " + myPhone.playGame("This game"));
        System.out.println();

        // browseWeb
        System.out.println("== Testing browseWeb()");
        myPhone.browseWeb("News site");
        System.out.println();

        // findPosition
        System.out.println("== Testing findPosition()");
        myPhone.findPosition("29.979504, 31.1320133,17");
        System.out.println();
    }
}