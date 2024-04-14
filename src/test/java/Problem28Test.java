import org.iamalexvybornyi.Problem28;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem28Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void problem28BasicTest(String input, String searchTerm, int expectedResult) {
        Problem28 problem28 = new Problem28();
        int actualResult = problem28.strStr(input, searchTerm);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("leetcode", "leeto", -1),
                Arguments.of("abcdef", "f", 5)
        );
    }
}
