public class SmartPhone extends MobilePhone {

    public void browseWeb(String webpage) {
        System.out.println("This is the webpage you're visiting: " + webpage);
    }

    public void findPosition(String coordinates) {
        System.out.println("These are your fake GPS coordinates: " + coordinates);
    }

    /**
     * Exercise 2 - Day 08
     * Save money by routing your international calls through the internet!
     * Modify your class SmartPhone so that it overrides the method call(String)
     * inherited from OldPhone. If the string parameter starts with “00”, the
     * method should output “Calling <number> through the internet to save
     * money”; otherwise, the method should do the same as the original method
     * (hint: use super).
     */

    @Override
    public void call(String number) {
        super.call(number);
        if (number.charAt(0) == '0' && number.charAt(1) == '0') {
            System.out.println("Routing international call through the internet to save money");
        }
    }
}