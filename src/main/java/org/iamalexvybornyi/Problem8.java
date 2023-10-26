package org.iamalexvybornyi;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * </p>
 * The algorithm for myAtoi(string s) is as follows:
 * </p>
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 * </p>
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 * </p>
 *
 * Example 1:
 * </p>
 * Input: s = "42"
 * Output: 42
 * Explanation: The underlined characters are what is read in, the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "42" ("42" is read in)
 *            ^
 * The parsed integer is 42.
 * Since 42 is in the range [-231, 231 - 1], the final result is 42.
 * Example 2:
 * </p>
 * Input: s = "   -42"
 * Output: -42
 * Explanation:
 * Step 1: "   -42" (leading whitespace is read and ignored)
 *             ^
 * Step 2: "   -42" ('-' is read, so the result should be negative)
 *              ^
 * Step 3: "   -42" ("42" is read in)
 *                ^
 * The parsed integer is -42.
 * Since -42 is in the range [-231, 231 - 1], the final result is -42.
 * Example 3:
 * </p>
 * Input: s = "4193 with words"
 * Output: 4193
 * Explanation:
 * Step 1: "4193 with words" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
 *              ^
 * The parsed integer is 4193.
 * Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
 * </p>
 *
 * Constraints:
 * </p>
 * 0 <= s.length <= 200
 * s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */
public class Problem8 {

    public int myAtoi(String s) {
        String trimmedInput = s.trim();
        if (trimmedInput.isEmpty()) {
            return 0;
        }
        int sign = 1;
        if (trimmedInput.charAt(0) == '+' || trimmedInput.charAt(0) == '-') {
            if (trimmedInput.charAt(0) == '-') {
                sign *= -1;
            }
            trimmedInput = trimmedInput.substring(1);
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < trimmedInput.length() && Character.isDigit(trimmedInput.charAt(i)); i++) {
            output.append(trimmedInput.charAt(i));
        }

        int lastPrecedingZeroIndex = -1;
        for (int i = 0; i < output.length() && output.charAt(i) == '0'; i++) {
            lastPrecedingZeroIndex = i;
        }
        if (lastPrecedingZeroIndex >= 0) {
            output.delete(0, lastPrecedingZeroIndex);
        }

        if (output.length() <= 10) {
            if (output.isEmpty()) {
                return 0;
            }
            long result = Long.parseLong(output.toString()) * sign;
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            return (int) result;
        } else {
            if (sign > 0) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }
    }
}
