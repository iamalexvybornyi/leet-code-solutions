import org.iamalexvybornyi.Problem8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem8Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void myAtoiBasicTest(String input, int expectedResult) {
        Problem8 problem8 = new Problem8();
        int actualResult = problem8.myAtoi(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("   -42", -42),
                Arguments.of("4193 with words", 4193)
        );
    }
}
