/**
 * demo class for ct548 presentation
 *
 * https://en.wikipedia.org/wiki/Fibonacci_number
 * example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 14
 *
 * @file Fibonacci.java
 */

package ie.nuigalway.sd3;

public class Fibonacci {

    public static int Fibonacci(int n) {

        int result = 0;

        if (n < 0) { //we dont want negative n's

            throw new IllegalArgumentException("Ooops this method can only accept a min n = 0");
        }
        if (n == 0) { //first fibonacci number is always 0

            result = 0;
        } else if (n == 1) { //second one is always 1

            result = 1;
        } else if (n <= 46) { //n=2 to n=46

            result = withRecursion(n - 1) + withRecursion(n - 2);
        } else {

            throw new IllegalArgumentException("Ooops this method can only accept a max n = 46");
        }

        return result;
    }
}
