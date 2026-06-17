package Day44;

import java.util.*;

public class DFSGraph {

    static void dfs(
            int node,
            boolean[] visited,
            ArrayList<ArrayList<Integer>>
                    graph) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbor :
                graph.get(node)) {

            if (!visited[neighbor]) {

                dfs(
                        neighbor,
                        visited,
                        graph
                );
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        for (int i = 0;
             i < vertices;
             i++) {

            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        boolean[] visited =
                new boolean[vertices];

        dfs(0, visited, graph);
    }
}