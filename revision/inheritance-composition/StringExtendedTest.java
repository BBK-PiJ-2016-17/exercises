public class StringExtendedTest {
    public static void main(String[] args) {
        StringExtendedTest test = new StringExtendedTest();
        test.launch();
    }

    public void launch() {
        StringExtended myString = new StringExtended();

        myString.printEven("BackBeethovenAndMozart");
        myString.printEven("This must be the place");
    }
}