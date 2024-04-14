import org.iamalexvybornyi.Problem3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem3Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void lengthOfLongestSubstringBasicTest(String s, int expectedResult) {
        Problem3 problem3 = new Problem3();
        int actualResult = problem3.lengthOfLongestSubstring(s);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3)
        );
    }
}
