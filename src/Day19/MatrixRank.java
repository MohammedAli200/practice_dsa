package Day19;

public class MatrixRank {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2},
                {2, 4}
        };

        int determinant =
                matrix[0][0]
                        * matrix[1][1]
                        - matrix[0][1]
                        * matrix[1][0];

        if (determinant != 0) {

            System.out.println(
                    "Rank: 2"
            );

        } else {

            System.out.println(
                    "Rank: 1"
            );
        }
    }
}