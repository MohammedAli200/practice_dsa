package Day18;

public class PositiveNegativeMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, -2, 3},
                {-4, 5, -6},
                {7, -8, 9}
        };

        int positive = 0;
        int negative = 0;

        for (int[] row : matrix) {

            for (int num : row) {

                if (num >= 0) {

                    positive++;

                } else {

                    negative++;
                }
            }
        }

        System.out.println(
                "Positive Count: "
                        + positive
        );

        System.out.println(
                "Negative Count: "
                        + negative
        );
    }
}