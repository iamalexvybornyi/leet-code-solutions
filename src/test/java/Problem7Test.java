import org.iamalexvybornyi.Problem7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem7Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void reverseIntegerTest(int input, int expectedResult) {
        Problem7 problem7 = new Problem7();
        int actualResult1 = problem7.reverse(input);
        int actualResult2 = problem7.reverse2(input);
        Assertions.assertEquals(expectedResult, actualResult1);
        Assertions.assertEquals(expectedResult, actualResult2);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21)
        );
    }
}
