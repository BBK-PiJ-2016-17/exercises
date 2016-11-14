public class Alphabet {
    public static void main(String[] args) {
        char letterUpperCase = 'A';
        char letterLowerCase = 'a';

        int i = 0;

        System.out.println();

        // Unicode apparently has 109384 chars mapped
        // I'm only printing the Latin alphabet
        for (i = 0; i < 26; i++) {
            System.out.print(" " + letterUpperCase);
            letterUpperCase++;
        }

        System.out.println("\n");

        for (i = 0; i < 26; i++) {
            System.out.print(" " + letterLowerCase);
            letterLowerCase++;
        }

        System.out.println("\n");
    }
}