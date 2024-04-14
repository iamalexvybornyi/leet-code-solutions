package org.iamalexvybornyi;

import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.
 * Example 2:
 * <p>
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 3:
 * <p>
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= num <= 3999
 */
public class Problem12 {
    public String intToRoman(int num) {

        int input = num;
        int factor = 1;
        while (input > 0) {
            input /= 10;
            if (input > 0) {
                factor *= 10;
            }
        }

        StringBuilder outputStringBuilder = new StringBuilder();
        input = num;
        while (factor > 0) {
            int currentValue = input / factor * factor;
            input -= currentValue;
            outputStringBuilder.append(intToRomanInternal(currentValue));
            factor /= 10;
        }

        return outputStringBuilder.toString();
    }

    private String intToRomanInternal(int num) {
        final Map<Integer, String> dictionary = Map.ofEntries(
                Map.entry(1, "I"),
                Map.entry(2, "II"),
                Map.entry(3, "III"),
                Map.entry(4, "IV"),
                Map.entry(5, "V"),
                Map.entry(6, "VI"),
                Map.entry(7, "VII"),
                Map.entry(8, "VIII"),
                Map.entry(9, "IX"),

                Map.entry(10, "X"),
                Map.entry(20, "XX"),
                Map.entry(30, "XXX"),
                Map.entry(40, "XL"),
                Map.entry(50, "L"),
                Map.entry(60, "LX"),
                Map.entry(70, "LXX"),
                Map.entry(80, "LXXX"),
                Map.entry(90, "XC"),

                Map.entry(100, "C"),
                Map.entry(200, "CC"),
                Map.entry(300, "CCC"),
                Map.entry(400, "CD"),
                Map.entry(500, "D"),
                Map.entry(600, "DC"),
                Map.entry(700, "DCC"),
                Map.entry(800, "DCCC"),
                Map.entry(900, "CM"),

                Map.entry(1000, "M"),
                Map.entry(2000, "MM"),
                Map.entry(3000, "MMM")
        );

        return dictionary.getOrDefault(num, "");
    }
}
