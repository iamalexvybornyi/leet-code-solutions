import org.iamalexvybornyi.Problem14;
import org.iamalexvybornyi.Problem15;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class Problem15Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void longestCommonPrefixBasicTest(int[] input, List<List<Integer>> expectedResult) {
        Problem15 problem15 = new Problem15();
        List<List<Integer>> actualResult = problem15.threeSum(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, List.of()),
                Arguments.of(new int[]{0, 0, 0}, List.of(List.of(0, 0, 0)))
        );
    }
}
