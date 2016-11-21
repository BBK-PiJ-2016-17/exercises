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

        System.out.println("Testing super()\n");

        MobilePhone myMobPhone = new MobilePhone("Samsung");
        SmartPhone mySmartPhone = new SmartPhone("HTC");

        System.out.println("This is OldPhone's brand: " + myPhone.getBrand());
        System.out.println("This is MobilePhone's brand: " + myMobPhone.getBrand());
        System.out.println("This is SmartPhone's brand: " + mySmartPhone.getBrand());
    }
}