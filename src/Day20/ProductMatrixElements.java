package Day20;

public class ProductMatrixElements {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        int product = 1;

        for (int[] row : matrix) {

            for (int num : row) {

                product *= num;
            }
        }

        System.out.println(
                "Product: "
                        + product
        );
    }
}