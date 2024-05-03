package org.iamalexvybornyi;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */
public class Problem67 {

    public String addBinary(String a, String b) {
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        int remainder = 0;
        for (int i = charArrayA.length - 1, j = charArrayB.length - 1; i >= 0 || j >= 0; i--, j--) {
            int aDigit = i >= 0 ? Character.getNumericValue(charArrayA[i]) : 0;
            int bDigit = j >= 0 ? Character.getNumericValue(charArrayB[j]) : 0;
            int currentResult = aDigit + bDigit + remainder;
            if (currentResult >= 2) {
                remainder = 1;
                currentResult = currentResult % 2;
            } else {
                remainder = 0;
            }
            stringBuilder.append(currentResult);
        }

        if (remainder > 0) {
            stringBuilder.append(remainder);
        }

        return stringBuilder.reverse().toString();
    }

}
