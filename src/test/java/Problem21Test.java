import org.iamalexvybornyi.Problem21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Problem21Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void mergeTwoListsBasicTest(Problem21.ListNode l1, Problem21.ListNode l2, Problem21.ListNode expectedResult) {
        Problem21 problem2 = new Problem21();
        Problem21.ListNode actualResult = problem2.mergeTwoLists(l1, l2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        new Problem21.ListNode(1, new Problem21.ListNode(2, new Problem21.ListNode(4))),
                        new Problem21.ListNode(1, new Problem21.ListNode(3, new Problem21.ListNode(4))),
                        new Problem21.ListNode(1, new Problem21.ListNode(1, new Problem21.ListNode(2, new Problem21.ListNode(3, new Problem21.ListNode(4, new Problem21.ListNode(4))))))
                ),
                Arguments.of(
                        new Problem21.ListNode(),
                        new Problem21.ListNode(),
                        new Problem21.ListNode(0, new Problem21.ListNode())
                ),
                Arguments.of(
                        new Problem21.ListNode(),
                        new Problem21.ListNode(0),
                        new Problem21.ListNode(0, new Problem21.ListNode())
                )
        );
    }
}
