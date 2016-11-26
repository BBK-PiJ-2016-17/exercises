public class MobilePhone extends OldPhone {

    public MobilePhone(String brand) {
        // Gets brand
        super(brand);
    }

    private String ringtone = null;

    public void ringAlarm(String ringtone) {
        // ringtone = "We are the champions";
        this.ringtone = ringtone;
        System.out.println("Ringtone set: " + ringtone);
    }

    private String game = null;

    // If I change the visibility from public to private (ex 4.1)
    // I can't access it from SmartPhone, but if I change it to protected,
    // I allow for package access.
    protected String playGame(String game) {
        this.game = game;
        return game;
    }

    // Keep list of last 10 numbers called

    private String[] myPhoneArray;

    // public MobilePhone() {
    //     myPhoneArray = new String[10];
    // }

    // THIS NEEDS FIXING
    // public void call(String number) {
    //     super.call(number);

    //     // myPhoneArray[0] = number;
    //     int i = 0;

    //     for (i = 0; i < 10; i++) {
    //         myPhoneArray[i] = number;
    //         i++;
    //     }

    //     // Maybe do a LinkedList?
        

    //     // increment and keep count of the 10 last numbers only;
    //     // if (number.length < 10)
    // }

    public void printLastNumbers(String lastCallers) {

    }
}