public class MobilePhone extends OldPhone {

    public String ringAlarm(String ringtone) {
        ringtone = "We are the champions";
        return ringtone;
    }

    public String playGame(String game) {
        game = "Snake";
        return game;
    }

    // Keep list of last 10 numbers called

    private String[] myPhoneArray;

    public MobilePhone() {
        myPhoneArray = new String[10];
    }

    public void call(String number) {
        super.call(number);

        // myPhoneArray[0] = number;
        int i = 0;

        for (i = 0; i < 10; i++) {
            myPhoneArray[i] = number;
            i++;
        }

        // Maybe do a LinkedList?
        

        // increment and keep count of the 10 last numbers only;
        // if (number.length < 10)
    }

    public void printLastNumbers(String lastCallers) {

    }
}