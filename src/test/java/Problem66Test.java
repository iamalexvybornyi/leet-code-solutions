import org.iamalexvybornyi.Problem66;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem66Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void plusOneBasicTest(int[] input, int[] expectedResult) {
        Problem66 problem66 = new Problem66();
        int[] actualResult = problem66.plusOne(input);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3}, new int[] {1,2,4}),
                Arguments.of(new int[] {4,3,2,1}, new int[] {4,3,2,2})
        );
    }
}
