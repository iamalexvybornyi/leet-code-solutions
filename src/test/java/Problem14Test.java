import org.iamalexvybornyi.Problem14;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem14Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void longestCommonPrefixBasicTest(String[] input, String expectedResult) {
        Problem14 problem14 = new Problem14();
        String actualResult = problem14.longestCommonPrefix(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new String[] {"flower","flow","flight"}, "fl"),
                Arguments.of(new String[] {"dog","racecar","car"}, "")
        );
    }
}
