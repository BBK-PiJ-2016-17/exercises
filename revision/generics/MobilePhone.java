public class MobilePhone extends OldPhone {

    public MobilePhone(String brand) {
        super(brand);
    }

    public void ringAlarm(String alarm) {
        System.out.println("Waking up to the sound of: " + alarm);
    }

    // If public, no problem to use it from everywhere
    // If I leave the default (package protected), SmartPhone can still use it
    // since it belongs to the same package. It won't be accessible from
    // outside the package.
    void playGame(String game) {
        System.out.println("You're playing at: " + game);
    }
}