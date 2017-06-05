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

        System.out.println("\n=== Direct Upcasting ===\n");

        MobilePhone myMobSmartPhone = new SmartPhone("The latest HTC");

        System.out.println(myPhone.getBrand());
        ((SmartPhone) myMobSmartPhone).browseWeb("https://twitter.com/");
        ((SmartPhone) myMobSmartPhone).findPosition();
        ((SmartPhone) myMobSmartPhone).call("0039012233");
        myMobSmartPhone.ringAlarm("Mob phone ring ring");
        myMobSmartPhone.playGame("Scrabble");

        System.out.println("\n=== Indirect Upcasting ===\n");

        testPhone(myMobSmartPhone);

        System.out.println("\n=== Downcasting ===\n");

        testPhoneDowncast(myMobSmartPhone);

        System.out.println("\n=== Casting Exception ===\n");

        MobilePhone exPhone = new MobilePhone("Alcatel");

        testPhone(exPhone);
        // testPhoneDownCast(exPhone);

        testPhone(new MobilePhone("BlackBerry"));

    }

    public void testPhone(Phone phone) {
        phone.call("1-4-5-6999");
        // phone.ringAlarm("Ringing an alarm");
        // phone.playGame("Scrabble");
    }

    public void testPhoneDowncast(Phone phone) {
        SmartPhone sp = (SmartPhone) phone;
        sp.call("1-4-5-6999");
        sp.ringAlarm("Ringing an alarm");
        sp.playGame("Scrabble");
    }
}