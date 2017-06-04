public class SmartPhoneTester {

    public static void main(String[] args) {
        SmartPhoneTester test = new SmartPhoneTester();
        test.launch();
    }

    public void launch() {
        SmartPhone myPhone = new SmartPhone("The latest HTC");

        System.out.println(myPhone.getBrand());
        myPhone.browseWeb("https://twitter.com/");
        myPhone.findPosition();
        myPhone.call("0039012233");
        myPhone.ringAlarm("Ring ring");

        System.out.println("\n=== Upcasting ===\n");

        MobilePhone myMobSmartPhone = new SmartPhone("The latest HTC");

        System.out.println(myPhone.getBrand());
        ((SmartPhone) myMobSmartPhone).browseWeb("https://twitter.com/");
        ((SmartPhone) myMobSmartPhone).findPosition();
        ((SmartPhone) myMobSmartPhone).call("0039012233");
        myMobSmartPhone.ringAlarm("Mob phone ring ring");

    }
}