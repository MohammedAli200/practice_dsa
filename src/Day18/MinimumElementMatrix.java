package Day18;

public class MinimumElementMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {12, 7, 9},
                {3, 15, 6},
                {8, 10, 2}
        };

        int min = matrix[0][0];

        for (int[] row : matrix) {

            for (int num : row) {

                min = Math.min(min, num);
            }
        }

        System.out.println(
                "Minimum Element: "
                        + min
        );
    }
}