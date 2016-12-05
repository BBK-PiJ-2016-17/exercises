/**
 * Ex 6 - Day 10 // Greatest common divisor
 * 
 * The greatest common divisor (GCD) of two natural numbers is the largest
 * natural number that can exactly divide them both. For example, the GCD of 12
 * and 15 is 3, the GCD of 12 and 6 is 6 (because both divisons 12/6 and 6/6 are
 * exact), and the greatest common divisor of 14 and 27 is 1.
 * Finding the GCD of two numbers has a lot of applications in cryptography and
 * information security. We can find the GCD of two numbers by finding all of
 * them and them matching the lists for both numbers, but there is a fastest way.
 * The GCD has the property that
 *      if p > q, then gcd(p, q) = gcd(q, p mod q)
 * where mod represents the modulo operator (i.e. %). Therefore, given two
 * numbers p and q, where p > q, if q is a divisor of p, then q is the GCD of
 * both number; otherwise, we can apply the property above to find a pair of
 * smaller numbers with the same GCD.
 * Write a program that finds the GCD of two natural numbers recursively using
 * this property.
 * (Hint: your base case is that if q is a divisor of p, then q is the GCD of p
 * and q.)
 */

public class GreatestCommonDivisor {

    private int num1;
    private int num2;
    private int result;

    public int gdc(int num1, int num2) {
        if (num1 > num2) {
            // Base case
            if (num1 % num2 == 0) {
                result = num2;
            } else {
                result = gdc(num1, num1 % num2);
            }

        } else if (num2 > num1) {
            // Base case
            if (num2 % num1 == 0) {
                result = num1;
            } else {
                result = gdc(num2, num2 % num1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        GreatestCommonDivisor test = new GreatestCommonDivisor();
        test.launch();
    }

    public void launch() {
        System.out.println("The greatest common divisor between 6 and 3 is: " + gdc(6, 3));
        System.out.println("The greatest common divisor between 5 and 25 is: " + gdc(5, 25));
        System.out.println("The greatest common divisor between 21 and 14 is: " + gdc(21, 14));
        System.out.println("The greatest common divisor between 10 and 100 is: " + gdc(10, 100));
        System.out.println("The greatest common divisor between 55 and 25 is: " + gdc(55, 25));
        System.out.println("The greatest common divisor between 3 and 2 is: " + gdc(3, 2));
    }
}