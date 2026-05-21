package Day18;

public class EvenOddMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int even = 0;
        int odd = 0;

        for (int[] row : matrix) {

            for (int num : row) {

                if (num % 2 == 0) {

                    even++;

                } else {

                    odd++;
                }
            }
        }

        System.out.println(
                "Even Count: "
                        + even
        );

        System.out.println(
                "Odd Count: "
                        + odd
        );
    }
}