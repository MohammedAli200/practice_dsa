package Day38;

import java.util.*;

public class RottenOranges {

    public static void main(String[] args) {

        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };

        Queue<int[]> queue =
                new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0;
                 j < grid[0].length;
                 j++) {

                if (grid[i][j] == 2) {

                    queue.offer(
                            new int[]{i, j}
                    );

                } else if (grid[i][j] == 1) {

                    fresh++;
                }
            }
        }

        int minutes = 0;

        int[][] dir = {
                {1,0},{-1,0},
                {0,1},{0,-1}
        };

        while (!queue.isEmpty()
                && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] cell = queue.poll();

                for (int[] d : dir) {

                    int r = cell[0] + d[0];
                    int c = cell[1] + d[1];

                    if (r >= 0
                            && c >= 0
                            && r < grid.length
                            && c < grid[0].length
                            && grid[r][c] == 1) {

                        grid[r][c] = 2;

                        fresh--;

                        queue.offer(
                                new int[]{r, c}
                        );
                    }
                }
            }

            minutes++;
        }

        System.out.println(
                fresh == 0
                        ? minutes
                        : -1
        );
    }
}