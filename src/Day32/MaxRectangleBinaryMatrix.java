package Day32;

import java.util.*;

public class MaxRectangleBinaryMatrix {

    static int histogram(int[] heights) {

        Stack<Integer> stack =
                new Stack<>();

        int maxArea = 0;
        int i = 0;

        while (i < heights.length) {

            if (stack.isEmpty()
                    || heights[
                    stack.peek()
                    ] <= heights[i]) {

                stack.push(i++);

            } else {

                int top =
                        stack.pop();

                int area =
                        heights[top]
                                * (
                                stack.isEmpty()
                                        ? i
                                        : i
                                        - stack.peek()
                                        - 1
                        );

                maxArea =
                        Math.max(
                                maxArea,
                                area
                        );
            }
        }

        while (!stack.isEmpty()) {

            int top =
                    stack.pop();

            int area =
                    heights[top]
                            * (
                            stack.isEmpty()
                                    ? i
                                    : i
                                    - stack.peek()
                                    - 1
                    );

            maxArea =
                    Math.max(
                            maxArea,
                            area
                    );
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}
        };

        int[] heights =
                new int[matrix[0].length];

        int maxArea = 0;

        for (int[] row : matrix) {

            for (int j = 0;
                 j < row.length;
                 j++) {

                heights[j] =
                        row[j] == 0
                                ? 0
                                : heights[j] + 1;
            }

            maxArea =
                    Math.max(
                            maxArea,
                            histogram(heights)
                    );
        }

        System.out.println(
                "Max Rectangle Area = "
                        + maxArea
        );
    }
}