package Day21;

public class ReverseRowsMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {

            int left = 0;
            int right = row.length - 1;

            while (left < right) {

                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left++;
                right--;
            }
        }

        for (int[] row : matrix) {

            for (int num : row) {

                System.out.print(
                        num + " "
                );
            }

            System.out.println();
        }
    }
}