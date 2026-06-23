package Day50;

import java.util.*;

public class RottenOranges {

    public static void main(String[] args) {

        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        Queue<int[]> queue =
                new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2) {

                    queue.offer(
                            new int[]{i, j}
                    );

                } else if (grid[i][j] == 1) {

                    fresh++;
                }
            }
        }

        int[][] directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        int minutes = 0;

        while (!queue.isEmpty()
                && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] current =
                        queue.poll();

                for (int[] dir : directions) {

                    int newRow =
                            current[0] + dir[0];

                    int newCol =
                            current[1] + dir[1];

                    if (newRow >= 0
                            && newCol >= 0
                            && newRow < grid.length
                            && newCol < grid[0].length
                            && grid[newRow][newCol] == 1) {

                        grid[newRow][newCol] = 2;

                        fresh--;

                        queue.offer(
                                new int[]{
                                        newRow,
                                        newCol
                                }
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