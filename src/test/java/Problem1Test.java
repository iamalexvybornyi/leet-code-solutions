import org.iamalexvybornyi.Problem1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem1Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void twoSumBasicTest(int[] nums, int target, int[] expectedOutput) {
        Problem1 problem1 = new Problem1();
        int[] result = problem1.twoSum(nums, target);
        Assertions.assertArrayEquals(expectedOutput, result);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }
}
