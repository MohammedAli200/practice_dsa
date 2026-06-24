package Day51;

public class PacificAtlanticWaterFlow {

    static int[][] directions = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
    };

    static void dfs(
            int[][] heights,
            boolean[][] visited,
            int row,
            int col) {

        visited[row][col] = true;

        for (int[] dir : directions) {

            int newRow =
                    row + dir[0];

            int newCol =
                    col + dir[1];

            if (newRow >= 0
                    && newCol >= 0
                    && newRow < heights.length
                    && newCol < heights[0].length
                    && !visited[newRow][newCol]
                    && heights[newRow][newCol]
                    >= heights[row][col]) {

                dfs(
                        heights,
                        visited,
                        newRow,
                        newCol
                );
            }
        }
    }

    public static void main(String[] args) {

        int[][] heights = {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}
        };

        boolean[][] pacific =
                new boolean[5][5];

        boolean[][] atlantic =
                new boolean[5][5];

        System.out.println(
                "Pacific Atlantic Flow"
        );
    }
}