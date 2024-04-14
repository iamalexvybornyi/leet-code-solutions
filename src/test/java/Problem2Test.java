import org.iamalexvybornyi.Problem2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem2Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void addTwoNumbersBasicTest(Problem2.ListNode l1, Problem2.ListNode l2, Problem2.ListNode expectedResult) {
        Problem2 problem2 = new Problem2();
        Problem2.ListNode actualResult = problem2.addTwoNumbers(l1, l2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        new Problem2.ListNode(2, new Problem2.ListNode(4, new Problem2.ListNode(3))),
                        new Problem2.ListNode(5, new Problem2.ListNode(6, new Problem2.ListNode(4))),
                        new Problem2.ListNode(7, new Problem2.ListNode(0, new Problem2.ListNode(8)))
                ),
                Arguments.of(
                        new Problem2.ListNode(0),
                        new Problem2.ListNode(0),
                        new Problem2.ListNode(0)
                ),
                Arguments.of(
                        new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(9))))))),
                        new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(9)))),
                        new Problem2.ListNode(8, new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(9, new Problem2.ListNode(0, new Problem2.ListNode(0, new Problem2.ListNode(0, new Problem2.ListNode(1))))))))
                        )
        );
    }
}
