package Day31;

public class SearchSortedMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };

        int target = 29;

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length &&
                col >= 0) {

            if (matrix[row][col] == target) {

                System.out.println(
                        "Found at: "
                                + row + ", " + col
                );

                return;
            }

            if (matrix[row][col] > target) {

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