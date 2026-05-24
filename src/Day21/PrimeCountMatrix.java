package Day21;

public class PrimeCountMatrix {

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2;
             i * i <= n;
             i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {2, 4, 5},
                {7, 8, 11},
                {13, 16, 17}
        };

        int count = 0;

        for (int[] row : matrix) {

            for (int num : row) {

                if (isPrime(num)) {
                    count++;
                }
            }
        }

        System.out.println(
                "Prime Count: "
                        + count
        );
    }
}