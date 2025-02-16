package org.iamalexvybornyi;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 *
 * Example 1:
 * <p>
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 * <p>
 * Input: numRows = 1
 * Output: [[1]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= numRows <= 30
 */
public class Problem118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTrianglelist = new ArrayList<>();
        pascalTrianglelist.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            pascalTrianglelist.add(new ArrayList<>());
            for (int j = 0; j < i + 1; j++) {
                int leftSideAbove = 0;
                int rightSideAbove = 0;
                if ((j - 1) >= 0) {
                    leftSideAbove = pascalTrianglelist.get(i - 1).get(j - 1);
                }
                if (j <= i - 1) {
                    rightSideAbove = pascalTrianglelist.get(i - 1).get(j);
                }
                pascalTrianglelist.get(i).add(leftSideAbove + rightSideAbove);
            }
        }

        return pascalTrianglelist;
    }
}
