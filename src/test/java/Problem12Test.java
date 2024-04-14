import org.iamalexvybornyi.Problem12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem12Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void intToRomanBasicTest(int input, String expectedResult) {
        Problem12 problem12 = new Problem12();
        String actualResult = problem12.intToRoman(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(3, "III"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV")
        );
    }
}
