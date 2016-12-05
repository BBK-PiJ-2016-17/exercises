/**
 * Ex 4 - Day 10
 * Palindrome
 *
 * Create a program with a (recursive) method that takes a String paremeter and
 * returns true if the String is a palindrome and false otherwise. Compare this
 * recursive version with the iterative version you wrote in past weeks.
 * Which one seems clearer to you?
 */

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;

        return  s.charAt(0) == s.charAt(s.length() - 1)
                && isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Palindrome test = new Palindrome();
        test.launch();
    }

    public void launch() {
        System.out.println("Is \"test\" a palindrome? " + isPalindrome("test"));
        System.out.println("Is \"cacca\" a palindrome? " + isPalindrome("cacca"));
        System.out.println("Is \"ada\" a palindrome? " + isPalindrome("ada"));
        System.out.println("Is \"tattarrattat\" a palindrome? " + isPalindrome("tattarrattat"));
        System.out.println("Is \"noel sees leon\" a palindrome? " + isPalindrome("noel sees leon"));
    }
}