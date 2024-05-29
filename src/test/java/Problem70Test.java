import org.iamalexvybornyi.Problem70;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem70Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void climbStairsBasicTest(int n, int expectedResult) {
        Problem70 problem70 = new Problem70();
        int actualResult = problem70.climbStairs(n);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(5, 8)
        );
    }
}
