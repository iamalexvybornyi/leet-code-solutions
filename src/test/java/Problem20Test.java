import org.iamalexvybornyi.Problem20;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem20Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void validParenthesisBasicTest(String input, boolean expectedResult) {
        Problem20 problem20 = new Problem20();
        boolean actualResult = problem20.isValid(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false)
        );
    }
}
