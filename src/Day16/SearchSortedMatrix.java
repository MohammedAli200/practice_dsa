package Day16;

public class SearchSortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 14;

        int row = 0;
        int col =
                matrix[0].length - 1;

        while (row < matrix.length
                && col >= 0) {

            if (matrix[row][col]
                    == target) {

                System.out.println(
                        "Element Found"
                );

                return;
            }

            if (matrix[row][col]
                    > target) {

                col--;

            } else {

                row++;
            }
        }

        System.out.println(
                "Element Not Found"
        );
    }
}