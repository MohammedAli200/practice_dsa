package Day48;

import java.util.*;

public class BridgesInGraph {

    static int timer = 0;

    static void dfs(
            int node,
            int parent,
            boolean[] visited,
            int[] disc,
            int[] low,
            ArrayList<ArrayList<Integer>> graph) {

        visited[node] = true;

        disc[node] = low[node] = ++timer;

        for (int neighbor : graph.get(node)) {

            if (neighbor == parent) {
                continue;
            }

            if (!visited[neighbor]) {

                dfs(
                        neighbor,
                        node,
                        visited,
                        disc,
                        low,
                        graph
                );

                low[node] =
                        Math.min(
                                low[node],
                                low[neighbor]
                        );

                if (low[neighbor]
                        > disc[node]) {

                    System.out.println(
                            node + " - "
                                    + neighbor
                    );
                }

            } else {

                low[node] =
                        Math.min(
                                low[node],
                                disc[neighbor]
                        );
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {

            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(0);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(3).add(4);
        graph.get(4).add(3);

        boolean[] visited =
                new boolean[vertices];

        int[] disc = new int[vertices];
        int[] low = new int[vertices];

        dfs(
                0,
                -1,
                visited,
                disc,
                low,
                graph
        );
    }
}