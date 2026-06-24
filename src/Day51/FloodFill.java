package Day51;

public class FloodFill {

    static void fill(
            int[][] image,
            int row,
            int col,
            int oldColor,
            int newColor) {

        if (row < 0
                || col < 0
                || row >= image.length
                || col >= image[0].length
                || image[row][col]
                != oldColor) {

            return;
        }

        image[row][col] =
                newColor;

        fill(
                image,
                row + 1,
                col,
                oldColor,
                newColor
        );

        fill(
                image,
                row - 1,
                col,
                oldColor,
                newColor
        );

        fill(
                image,
                row,
                col + 1,
                oldColor,
                newColor
        );

        fill(
                image,
                row,
                col - 1,
                oldColor,
                newColor
        );
    }

    public static void main(String[] args) {

        int[][] image = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        fill(
                image,
                1,
                1,
                1,
                2
        );

        for (int[] row : image) {

            for (int value : row) {

                System.out.print(
                        value + " "
                );
            }

            System.out.println();
        }
    }
}