import org.iamalexvybornyi.Problem9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem9Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void isPalindromeBasicTest(int input, boolean expectedResult) {
        Problem9 problem9 = new Problem9();
        boolean actualResult1 = problem9.isPalindrome(input);
        Assertions.assertEquals(expectedResult, actualResult1);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false)
        );
    }
}
