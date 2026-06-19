package Day46;

import java.util.*;

public class FloydWarshall {

    public static void main(String[] args) {

        int INF = 99999;

        int[][] graph = {
                {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0}
        };

        int vertices = graph.length;

        for (int k = 0;
             k < vertices;
             k++) {

            for (int i = 0;
                 i < vertices;
                 i++) {

                for (int j = 0;
                     j < vertices;
                     j++) {

                    if (
                            graph[i][k]
                                    + graph[k][j]
                                    <
                                    graph[i][j]
                    ) {

                        graph[i][j] =
                                graph[i][k]
                                        + graph[k][j];
                    }
                }
            }
        }

        for (int[] row : graph) {

            System.out.println(
                    Arrays.toString(row)
            );
        }
    }
}