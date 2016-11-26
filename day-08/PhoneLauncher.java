public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch() {

        // Testing basic stuff here

        System.out.println();
        System.out.println("==== Part one ====");

        OldPhone myPhone = new OldPhone("Nokia");
        myPhone.call("1-call-me");
        System.out.println("");

        System.out.println("==== Part two ====");

        System.out.println("Testing super() and public/private/protected \n");

        MobilePhone myMobPhone = new MobilePhone("Samsung");
        String mobGame = myMobPhone.playGame("Simple Snake");
        SmartPhone mySmartPhone = new SmartPhone("HTC");
        String smartGame = mySmartPhone.playGame("Advanced Snake");

        System.out.println("This is OldPhone's brand: " + myPhone.getBrand());
        System.out.println("This is MobPhone's brand: " + myMobPhone.getBrand());
        System.out.println("This is SmartPhone's brand: " + mySmartPhone.getBrand());

        // Test ringtone

        myMobPhone.ringAlarm("Wishlist");
        mySmartPhone.ringAlarm("Carry on");

        // Test game

        System.out.println("This game on MobPhone: " + myMobPhone.playGame(mobGame));
        System.out.println("This game on SmartPhone: " + mySmartPhone.playGame(smartGame));

        // Test browsing the internet
        mySmartPhone.browseWeb("News site");

        // Testing findPosition method
        mySmartPhone.findPosition("29.979504, 31.1320133,17");

    }
}