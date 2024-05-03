import org.iamalexvybornyi.Problem88;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem88Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void mergeSortedArraysBasicTest(int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
        Problem88 problem88 = new Problem88();
        problem88.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(expectedResult, nums1);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3, new int[] {1,2,2,3,5,6}),
                Arguments.of(new int[] {1}, 1, new int[] {}, 0, new int[] {1}),
                Arguments.of(new int[] {0}, 0, new int[] {1}, 1, new int[] {1})
        );
    }
}
