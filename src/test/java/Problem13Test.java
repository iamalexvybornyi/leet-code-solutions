import org.iamalexvybornyi.Problem13;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem13Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void romanToIntBasicTest(String input, int expectedResult) {
        Problem13 problem13 = new Problem13();
        int actualResult = problem13.romanToInt(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994)
        );
    }
}
