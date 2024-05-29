package org.iamalexvybornyi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * <p>
 * A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * <p>
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2:
 * <p>
 * Input: digits = ""
 * Output: []
 * Example 3:
 * <p>
 * Input: digits = "2"
 * Output: ["a","b","c"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 */
public class Problem17 {

    public List<String> letterCombinations(String digits) {
        Map<Character, String> digitToLetters = initializeMap();
        List<String> combinations = new ArrayList<>();
        if (!digits.isEmpty()) {
            solve(0, digits, digitToLetters, "", combinations);
        }
        return combinations;
    }

    private Map<Character, String> initializeMap() {
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        return digitToLetters;
    }

    private void solve(int idx, String digits, Map<Character, String> digitToLetters, String charsSoFar,
                       List<String> combinations) {

        if (idx == digits.length()) {
            combinations.add(charsSoFar);
            return;
        }

        String digitLetters = digitToLetters.get(digits.charAt(idx));

        for (int i = 0; i < digitLetters.length(); i++) {
            char curr = digitLetters.charAt(i);
            solve(idx + 1, digits, digitToLetters, charsSoFar + curr, combinations);
        }
    }
}
