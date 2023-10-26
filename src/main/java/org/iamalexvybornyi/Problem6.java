package org.iamalexvybornyi;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * </p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * </p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * </p>
 * string convert(string s, int numRows);
 * </p>
 *
 * Example 1:
 * </p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * </p>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 * </p>
 * Input: s = "A", numRows = 1
 * Output: "A"
 * </p>
 *
 * Constraints:
 * </p>
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */
public class Problem6 {
    public String convert(String s, int numRows) {
        int inputStringLength = s.length();

        if (numRows == 1 || inputStringLength == 1 || numRows >= inputStringLength) {
            return s;
        }

        StringBuilder rowString = new StringBuilder();

        for (int currentRowIndex = 0; currentRowIndex < numRows; currentRowIndex++) {
            rowString.append(s.charAt(currentRowIndex));
            if (currentRowIndex == 0 || currentRowIndex == numRows - 1) {
                int currentIndexInsideRow = currentRowIndex + numRows + (numRows - 2);
                while (currentIndexInsideRow < inputStringLength) {
                    rowString.append(s.charAt(currentIndexInsideRow));
                    currentIndexInsideRow = currentIndexInsideRow + numRows + (numRows - 2);
                }
            } else {
                int currentIndexInsideRow = currentRowIndex + numRows + (numRows - 2 * (currentRowIndex + 1));
                boolean firstOption = false;
                while (currentIndexInsideRow < inputStringLength) {
                    if (firstOption) {
                        rowString.append(s.charAt(currentIndexInsideRow));
                        currentIndexInsideRow = currentIndexInsideRow + numRows + (numRows - 2 * (currentRowIndex + 1));
                        firstOption = false;
                    } else {
                        rowString.append(s.charAt(currentIndexInsideRow));
                        currentIndexInsideRow = currentIndexInsideRow + 2 * currentRowIndex;
                        firstOption = true;
                    }
                }
            }
        }

        return rowString.toString();
    }
}
