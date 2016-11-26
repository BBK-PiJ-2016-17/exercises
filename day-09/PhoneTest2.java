/**
 * Ex 2 - Day 09 / Upcasting, downcasting
 * For this exercise, you will need to use again some classes and interfaces you
 * created last day: Phone, OldPhone, MobilePhone, SmartPhone.
 *
 * 2.2 Direct upcasting
 * Change the script in 2.1 so that the SmartPhone is created with the line:
 * Mobilephone myPhone = new Smartphone();
 * Compile your code again. Are there any problems? Why do this problems happen?
 * A - PROBLEMS: not finding symbols browseWeb() and findPosition() because the
 * class MobilePhone doesn't have them. 
 * What are the possible solutions?
 * A - Downcast myPhone which now is a MobilePhone to a SmartPhone to get access
 * to its methods.
 */

public class PhoneTest2 {

    public static void main(String[] args) {
        PhoneTest launcher = new PhoneTest();
        launcher.launch();
    }

    public void launch() {

        MobilePhone myPhone = new SmartPhone("HTC");

        SmartPhone myDownCastedPhone = (SmartPhone) myPhone;

        // Testing all SmartPhone methods
        
        System.out.println();

        // brand
        System.out.println("== Testing getBrand()");
        System.out.println("This phone's brand: " + myDownCastedPhone.getBrand());
        System.out.println();

        // call
        System.out.println("== Testing call()");
        myDownCastedPhone.call("0039 123456");
        System.out.println();

        // ringAlarm
        System.out.println("== Testing ringAlarm()");
        myDownCastedPhone.ringAlarm("Wishlist by Pearl Jam");
        System.out.println();

        // playGame
        System.out.println("== Testing playGame()");
        System.out.println("Im' playing: " + myDownCastedPhone.playGame("This game"));
        System.out.println();

        // browseWeb
        System.out.println("== Testing browseWeb()");
        myDownCastedPhone.browseWeb("News site");
        System.out.println();

        // findPosition
        System.out.println("== Testing findPosition()");
        myDownCastedPhone.findPosition("29.979504, 31.1320133,17");
        System.out.println();
    }
}