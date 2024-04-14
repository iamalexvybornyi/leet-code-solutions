import org.iamalexvybornyi.Problem58;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem58Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void lengthOfLastWordBasicTest(String input, int expectedResult) {
        Problem58 problem58 = new Problem58();
        int actualResult = problem58.lengthOfLastWord(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6)
        );
    }
}
