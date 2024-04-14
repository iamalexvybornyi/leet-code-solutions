import org.iamalexvybornyi.Problem27;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class Problem27Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void removeElementBasicTest(RemoveElementTestData removeElementTestData) {
        Problem27 problem27 = new Problem27();
        int result = problem27.removeElement(removeElementTestData.input(), removeElementTestData.val());
        Assertions.assertEquals(removeElementTestData.expectedNumberOfElements(), result);
        Assertions.assertArrayEquals(removeElementTestData.expectedOutputStart(),
                Arrays.copyOf(removeElementTestData.input(), result));
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new RemoveElementTestData(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2}, 2)),
                Arguments.of(new RemoveElementTestData(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 3, 0, 4}, 5)),
                Arguments.of(new RemoveElementTestData(new int[]{1}, 1, new int[]{}, 0)),
                Arguments.of(new RemoveElementTestData(new int[]{}, 1, new int[]{}, 0)),
                Arguments.of(new RemoveElementTestData(new int[]{2}, 3, new int[]{2}, 1))
        );
    }

    public record RemoveElementTestData(int[] input, int val, int[] expectedOutputStart, int expectedNumberOfElements) {
    }
}
