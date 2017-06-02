public class Runner {
    public static void main(String[] args) {
        Runner launcher = new Runner();
        launcher.launch();
    }

    public void launch() {
        Phone oldy = new OldPhone();
        MobilePhone mob = new MobilePhone();
        SmartPhone smart = new SmartPhone();

        oldy.call("111-555-937");
        mob.ringAlarm("It's a New Day - Muse");
        mob.playGame("Snake");
        smart.browseWeb("theguardian.com/uk");
        System.out.println(smart.findPosition());
    }
}