package org.iamalexvybornyi;

import java.util.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class Problem20 {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> brackets = Map.ofEntries(
                Map.entry(')', '('),
                Map.entry('}', '{'),
                Map.entry(']', '[')
        );
        Stack<Character> characters = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char currentCharFromArray : charArray) {
            Character currentCharOpeningBracket = brackets.getOrDefault(currentCharFromArray, null);
            if (currentCharOpeningBracket == null) {
                characters.push(currentCharFromArray);
            } else {
                if (characters.isEmpty()) {
                    return false;
                }
                if (characters.peek() != currentCharOpeningBracket) {
                    return false;
                } else {
                    characters.pop();
                }
            }
        }

        return characters.isEmpty();
    }

}
