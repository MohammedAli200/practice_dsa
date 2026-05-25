package Day22;

public class CountZeroMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 2, 0},
                {4, 0, 6},
                {0, 8, 9}
        };

        int count = 0;

        for (int[] row : matrix) {

            for (int num : row) {

                if (num == 0) {
                    count++;
                }
            }
        }

        System.out.println(
                "Zero Count: "
                        + count
        );
    }
}