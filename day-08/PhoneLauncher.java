public class PhoneLauncher {
    public static void main(String[] args) {

        // Testing basic stuff here

        System.out.println();
        System.out.println("==== Part one ====");

        OldPhone myPhone = new OldPhone();
        myPhone.call("1-call-me");
        System.out.println("");

        System.out.println("==== Part two ====");

        MobilePhone myMobPhone = new MobilePhone();

        //

        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }

    public void launch() {
        // your code creating and using SmartPhone here...
    }
}