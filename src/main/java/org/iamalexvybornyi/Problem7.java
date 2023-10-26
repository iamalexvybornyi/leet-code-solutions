package org.iamalexvybornyi;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: x = 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: x = -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: x = 120
 * Output: 21
 * <p>
 *
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */
public class Problem7 {

    public int reverse(int x) {
        String s = String.valueOf(x);
        if (s.length() == 1) {
            return Integer.parseInt(s);
        }
        s = new StringBuilder(s).reverse().toString();
        while (s.charAt(0) == '0') {
            s = s.substring(1);
        }
        if (s.contains("-")) {
            s = "-" + s.replaceAll("-", "");
        }
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    public int reverse2(int x) {
        int sign = 1;
        if (x < 0) {
            sign *= -1;
            x = -x;
        }

        long input = x;
        long divider = 1;
        while (input > 0) {
            input /= 10;
            divider *= 10;
        }

        long result = 0;
        long currentDivider = 10;
        while (divider >= 10) {
            long digit = x % currentDivider / (currentDivider / 10);
            divider /= 10;
            currentDivider *= 10;
            result *= 10;
            result += digit;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        if (sign < 0) {
            return (int) result * sign;
        } else {
            return (int) result;
        }
    }
}
