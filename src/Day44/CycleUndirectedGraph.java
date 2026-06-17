package Day44;

import java.util.*;

public class CycleUndirectedGraph {

    static boolean dfs(
            int node,
            int parent,
            boolean[] visited,
            ArrayList<ArrayList<Integer>>
                    graph) {

        visited[node] = true;

        for (int neighbor :
                graph.get(node)) {

            if (!visited[neighbor]) {

                if (dfs(
                        neighbor,
                        node,
                        visited,
                        graph)) {

                    return true;
                }

            } else if (
                    neighbor != parent) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        for (int i = 0;
             i < vertices;
             i++) {

            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(0);
        graph.get(0).add(2);

        boolean[] visited =
                new boolean[vertices];

        System.out.println(
                dfs(
                        0,
                        -1,
                        visited,
                        graph
                )
        );
    }
}