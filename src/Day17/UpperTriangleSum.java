package Day17;

public class UpperTriangleSum {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0;
             i < matrix.length;
             i++) {

            for (int j = i;
                 j < matrix.length;
                 j++) {

                sum += matrix[i][j];
            }
        }

        System.out.println(
                "Upper Triangle Sum: "
                        + sum
        );
    }
}