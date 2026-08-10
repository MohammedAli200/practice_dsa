package Day98;

import java.util.Scanner;

public class KthSmallestMatrix {

    static int countLessEqual(int[][] matrix, int value) {

        int n = matrix.length;
        int row = n - 1;
        int col = 0;

        int count = 0;

        while (row >= 0 && col < n) {

            if (matrix[row][col] <= value) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        int k = sc.nextInt();

        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (countLessEqual(matrix, mid) >= k)
                high = mid;
            else
                low = mid + 1;
        }

        System.out.println("K-th Smallest Element = " + low);
    }
}