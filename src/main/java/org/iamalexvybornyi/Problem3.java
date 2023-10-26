package org.iamalexvybornyi;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class Problem3 {

    public int lengthOfLongestSubstring(String s) {
        final char[] arrayOfChars = s.toCharArray();

        int longestSubstringLength = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            String currentSubstring = String.valueOf(arrayOfChars[i]);
            int j = i + 1;
            while (j < arrayOfChars.length && !currentSubstring.contains(String.valueOf(arrayOfChars[j]))) {
                currentSubstring += arrayOfChars[j];
                j++;
            }
            if (currentSubstring.length() > longestSubstringLength) {
                longestSubstringLength = currentSubstring.length();
            }
        }

        return longestSubstringLength;
    }

}
