import org.iamalexvybornyi.Problem35;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem35Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void searchInsertBasicTest(int[] input, int target, int expectedResult) {
        Problem35 problem35 = new Problem35();
        int actualResult = problem35.searchInsert(input, target);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 7, 4)
        );
    }
}
