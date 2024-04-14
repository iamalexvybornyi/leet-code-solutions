import org.iamalexvybornyi.Problem26;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class Problem26Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void removeDuplicatesBasicTest(RemoveDuplicatesTestData removeDuplicatesTestData) {
        Problem26 problem26 = new Problem26();
        int result = problem26.removeDuplicates(removeDuplicatesTestData.input());
        Assertions.assertEquals(removeDuplicatesTestData.expectedNumberOfElements(), result);
        Assertions.assertArrayEquals(removeDuplicatesTestData.expectedOutputStart(),
                Arrays.copyOf(removeDuplicatesTestData.input(), result));
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new RemoveDuplicatesTestData(new int[]{1,1,2}, new int[] {1,2}, 2)),
                Arguments.of(new RemoveDuplicatesTestData(new int[]{0,0,1,1,1,2,2,3,3,4}, new int[] {0,1,2,3,4}, 5)),
                Arguments.of(new RemoveDuplicatesTestData(new int[] {1,2}, new int[] {1,2}, 2))
        );
    }

    public record RemoveDuplicatesTestData (int[] input, int[] expectedOutputStart, int expectedNumberOfElements) {}
}
