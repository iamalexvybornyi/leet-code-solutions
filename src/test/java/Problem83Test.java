import org.iamalexvybornyi.Problem83;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem83Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void removeDuplicatesFromSortedListBasicTest(Problem83.ListNode input, Problem83.ListNode expectedResult) {
        Problem83 problem83 = new Problem83();
        Problem83.ListNode actualResult = problem83.deleteDuplicates(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        new Problem83.ListNode(1, new Problem83.ListNode(1, new Problem83.ListNode(2))),
                        new Problem83.ListNode(1, new Problem83.ListNode(2))
                ),
                Arguments.of(
                        new Problem83.ListNode(1, new Problem83.ListNode(1, new Problem83.ListNode(1))),
                        new Problem83.ListNode(1)
                ),
                Arguments.of(
                        new Problem83.ListNode(1, new Problem83.ListNode(1, new Problem83.ListNode(2, new Problem83.ListNode(3, new Problem83.ListNode(3))))),
                        new Problem83.ListNode(1, new Problem83.ListNode(2, new Problem83.ListNode(3)))
                )
        );
    }
}
