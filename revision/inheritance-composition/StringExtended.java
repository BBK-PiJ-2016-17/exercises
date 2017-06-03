// public class StringExtended extends String {
public class StringExtended {
    public void printEven(String word) {
        int wordLength = word.length();

        System.out.println(word);
        for (int i = 0; i < wordLength - 1; i = i + 2) {
            System.out.print(" " + word.charAt(i + 1));
        }

        System.out.println();
    }
}