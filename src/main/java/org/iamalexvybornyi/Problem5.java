package org.iamalexvybornyi;

/**
 * Given a string s, return the longest
 * palindromic
 * <p>
 * substring
 *  in s.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 *
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class Problem5 {

    public String longestPalindrome(String s) {
        String finalResult = "";

        if (s.length() <= 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            String oddPalindrome = extendPalindrome(s, i, i);
            String evenPalindrome = extendPalindrome(s, i, i + 1);
            if (oddPalindrome.length() > evenPalindrome.length()) {
                if (oddPalindrome.length() > finalResult.length()) {
                    finalResult = oddPalindrome;
                }
            } else {
                if (evenPalindrome.length() > finalResult.length()) {
                    finalResult = evenPalindrome;
                }
            }
        }

        return finalResult;
    }

    private String extendPalindrome(String input, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }

        return input.substring(left + 1, right);
    }

}
