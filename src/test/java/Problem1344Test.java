import org.iamalexvybornyi.Problem1344;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem1344Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void angleClockBasicTest(int hour, int minutes, double expectedResult) {
        Problem1344 problem1344 = new Problem1344();
        double actualResult = problem1344.angleClock(hour, minutes);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(12, 30, 165),
                Arguments.of(3, 30, 75),
                Arguments.of(3, 15, 7.5)
        );
    }
}
