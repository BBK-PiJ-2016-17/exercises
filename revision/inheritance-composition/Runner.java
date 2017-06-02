public class Runner {
    public static void main(String[] args) {
        Runner launcher = new Runner();
        launcher.launch();
    }

    public void launch() {
        OldPhone oldy = new OldPhone("Nokia");
        MobilePhone mob = new MobilePhone("Motorola");
        SmartPhone smart = new SmartPhone("Samsung");

        oldy.call("111-555-937");
        mob.ringAlarm("It's a New Day - Muse");
        mob.playGame("Snake");
        smart.browseWeb("theguardian.com/uk");
        System.out.println(smart.findPosition());
        smart.call("111-555-937");
        smart.call("0033-2298403");
        smart.playGame("Enhanced Snake");
        System.out.println("OldPhone brand: " + oldy.getBrand());
        System.out.println("MobilePhone brand: " + mob.getBrand());
        System.out.println("SmartPhone brand: " + smart.getBrand());
    }
}