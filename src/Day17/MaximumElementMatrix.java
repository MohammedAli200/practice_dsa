package Day17;

public class MaximumElementMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 20, 3},
                {14, 5, 16},
                {7, 18, 9}
        };

        int max = matrix[0][0];

        for (int[] row : matrix) {

            for (int num : row) {

                max = Math.max(max, num);
            }
        }

        System.out.println(
                "Maximum Element: "
                        + max
        );
    }
}