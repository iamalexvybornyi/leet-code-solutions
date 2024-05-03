import org.iamalexvybornyi.Problem67;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem67Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void addBinaryBasicTest(String input1, String input2, String expectedResult) {
        Problem67 problem67 = new Problem67();
        String actualResult = problem67.addBinary(input1, input2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("1010", "1011", "10101")
        );
    }
}
