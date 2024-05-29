import org.iamalexvybornyi.Problem94;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem94Test {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void inorderTraversalBasicTest(Problem94.TreeNode treeNode, List<Integer> expectedResult) {
        Problem94 problem94 = new Problem94();
        List<Integer> actualResult = problem94.inorderTraversal(treeNode);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(
                        new Problem94.TreeNode(1,
                                null,
                                new Problem94.TreeNode(2, new Problem94.TreeNode(3), null)),
                        Arrays.asList(1, 3, 2)),
                Arguments.of(
                        new Problem94.TreeNode(1,
                                new Problem94.TreeNode(2, new Problem94.TreeNode(4), new Problem94.TreeNode(5)),
                                new Problem94.TreeNode(3, null, new Problem94.TreeNode(6))),
                        Arrays.asList(4, 2, 5, 1, 3, 6)),
                Arguments.of(null, new ArrayList<>()),
                Arguments.of(new Problem94.TreeNode(1), Arrays.asList(1))
        );
    }
}
