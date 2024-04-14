import org.iamalexvybornyi.Problem5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem5Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void longestPalindromeBasicTest(String s, String expectedResult) {
        Problem5 problem5 = new Problem5();
        String actualResult = problem5.longestPalindrome(s);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("babad", "bab"),
                Arguments.of("cbbd", "bb")
        );
    }
}
