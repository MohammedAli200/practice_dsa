package Day46;

import java.util.*;

public class PrimsAlgorithm {

    public static void main(String[] args) {

        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        int vertices = graph.length;

        boolean[] mst =
                new boolean[vertices];

        int[] key =
                new int[vertices];

        Arrays.fill(
                key,
                Integer.MAX_VALUE
        );

        key[0] = 0;

        int cost = 0;

        for (int count = 0;
             count < vertices;
             count++) {

            int u = -1;

            for (int i = 0;
                 i < vertices;
                 i++) {

                if (!mst[i]
                        &&
                        (u == -1
                                || key[i] < key[u])) {

                    u = i;
                }
            }

            mst[u] = true;
            cost += key[u];

            for (int v = 0;
                 v < vertices;
                 v++) {

                if (
                        graph[u][v] != 0
                                &&
                                !mst[v]
                                &&
                                graph[u][v]
                                        < key[v]
                ) {

                    key[v] = graph[u][v];
                }
            }
        }

        System.out.println(
                "MST Cost = " + cost
        );
    }
}