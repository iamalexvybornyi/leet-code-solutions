import org.iamalexvybornyi.Problem118;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class Problem118Test {

    @MethodSource("provideTestData")
    @ParameterizedTest
    public void pascalTriangleBasicTest(int numRows, List<List<Integer>> expectedGeneratedPascalTriangleList) {
        Problem118 problem118 = new Problem118();
        List<List<Integer>> generatedPascalTriangleList = problem118.generate(numRows);
        Assertions.assertEquals(expectedGeneratedPascalTriangleList, generatedPascalTriangleList);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(1, List.of(List.of(1))),
                Arguments.of(5,
                        List.of(
                                List.of(1),
                                List.of(1, 1),
                                List.of(1, 2, 1),
                                List.of(1, 3, 3, 1),
                                List.of(1, 4, 6, 4, 1)
                        )
                ),
                Arguments.of(7,
                        List.of(
                                List.of(1),
                                List.of(1, 1),
                                List.of(1, 2, 1),
                                List.of(1, 3, 3, 1),
                                List.of(1, 4, 6, 4, 1),
                                List.of(1, 5, 10, 10, 5, 1),
                                List.of(1, 6, 15, 20, 15, 6, 1)
                        )
                )
        );
    }
}
