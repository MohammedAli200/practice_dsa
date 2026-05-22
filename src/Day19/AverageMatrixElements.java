package Day19;

public class AverageMatrixElements {
    public static void main(String[] args) {

        int[][] matrix = {
                {2, 4, 6},
                {8, 10, 12}
        };

        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {

            for (int num : row) {

                sum += num;
                count++;
            }
        }

        double average =
                (double) sum / count;

        System.out.println(
                "Average: "
                        + average
        );
    }
}