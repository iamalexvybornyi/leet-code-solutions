import org.iamalexvybornyi.Problem11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem11Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void maxAreaBasicTest(int[] height, int expectedResult) {
        Problem11 problem11 = new Problem11();
        int actualResult = problem11.maxArea(height);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }
}
