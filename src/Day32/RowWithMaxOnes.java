package Day32;

public class RowWithMaxOnes {

    public static void main(String[] args) {

        int[][] matrix = {
                {0,0,0,1},
                {0,1,1,1},
                {1,1,1,1},
                {0,0,1,1}
        };

        int rowIndex = -1;
        int maxCount = 0;

        for (int i = 0;
             i < matrix.length;
             i++) {

            int count = 0;

            for (int j = 0;
                 j < matrix[0].length;
                 j++) {

                if (matrix[i][j] == 1) {

                    count++;
                }
            }

            if (count > maxCount) {

                maxCount = count;
                rowIndex = i;
            }
        }

        System.out.println(
                "Row = "
                        + rowIndex
        );
    }
}