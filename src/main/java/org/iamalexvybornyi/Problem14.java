package org.iamalexvybornyi;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class Problem14 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            boolean equalChars = true;
            char firstStringCurrentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != firstStringCurrentChar) {
                    equalChars = false;
                    break;
                }
            }
            if (equalChars) {
                output.append(firstStringCurrentChar);
            } else {
                break;
            }
        }
        return output.toString();
    }

}
