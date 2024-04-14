import org.iamalexvybornyi.Problem6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem6Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void zigzagConversionBasicTest(String s, int numRows, String expectedResult) {
        Problem6 problem6 = new Problem6();
        String actualResult = problem6.convert(s, numRows);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                Arguments.of("A", 1, "A")
        );
    }
}
