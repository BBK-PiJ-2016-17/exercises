public class Recursive {
    private String input;
    private int wordLength;

    public Recursive(String input) {
        this.input = input;
        this.wordLength = input.length();
    }

    // This doesn't reverse
    public void recursivePrint() {
        for (int i = 0; i < wordLength; i++) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
        wordLength--;
        while(wordLength > 0) {
            recursivePrint();
        }
    }
    ////


    public void stringRecurse(String input){
        System.out.println(input);
        if (input.length() > 1) stringRecurse(input.substring(0, input.length() - 1));
        System.out.println(input);
    }

    public static void main(String[] args) {
        Recursive word = new Recursive("Staparola");

        // word.recursivePrint();

        word.stringRecurse("Staparola");
    }
}