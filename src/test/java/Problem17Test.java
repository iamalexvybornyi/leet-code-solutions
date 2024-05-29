import org.iamalexvybornyi.Problem17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class Problem17Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void letterCombinationsBasicTest(String intputString, List<String> expectedResult) {
        Problem17 problem17 = new Problem17();
        List<String> actualResult = problem17.letterCombinations(intputString);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("23", List.of("ad","ae","af","bd","be","bf","cd","ce","cf")),
                Arguments.of("", List.of()),
                Arguments.of("2", List.of("a","b","c"))
        );
    }
}
