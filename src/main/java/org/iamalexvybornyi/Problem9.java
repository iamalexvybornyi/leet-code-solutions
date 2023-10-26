package org.iamalexvybornyi;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 *
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 * <p>
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class Problem9 {
    public boolean isPalindrome(int x) {
        String xAsString = String.valueOf(x);
        return new StringBuilder(xAsString).reverse().toString().equals(xAsString);
    }

    public boolean isPalindrome2(int x) {
        int input = x;
        int divider = 1;
        while (input > 0) {
            input /= 10;
            divider *= 10;
        }

        int secondDivider = 10;
        boolean isPalindrome = true;
        while (divider >= 10 && isPalindrome) {
            int firstDigit = x % divider / (divider / 10);
            int secondDigit = x % secondDivider / (secondDivider / 10);
            if (firstDigit != secondDigit) {
                isPalindrome = false;
            }
            divider /= 10;
            secondDivider *= 10;
        }
        return isPalindrome;
    }
}
