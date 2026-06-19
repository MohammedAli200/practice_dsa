package Day46;

import java.util.*;

public class KosarajuAlgorithm {

    static void dfs(
            int node,
            boolean[] visited,
            Stack<Integer> stack,
            ArrayList<ArrayList<Integer>> graph) {

        visited[node] = true;

        for (int neighbor :
                graph.get(node)) {

            if (!visited[neighbor]) {

                dfs(
                        neighbor,
                        visited,
                        stack,
                        graph
                );
            }
        }

        stack.push(node);
    }

    static void reverseDfs(
            int node,
            boolean[] visited,
            ArrayList<ArrayList<Integer>> reversed) {

        visited[node] = true;

        System.out.print(node + " ");

        for (int neighbor :
                reversed.get(node)) {

            if (!visited[neighbor]) {

                reverseDfs(
                        neighbor,
                        visited,
                        reversed
                );
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        ArrayList<ArrayList<Integer>>
                reversed = new ArrayList<>();

        for (int i = 0;
             i < vertices;
             i++) {

            graph.add(new ArrayList<>());
            reversed.add(new ArrayList<>());
        }

        graph.get(0).add(2);
        graph.get(2).add(1);
        graph.get(1).add(0);
        graph.get(0).add(3);
        graph.get(3).add(4);

        for (int i = 0;
             i < vertices;
             i++) {

            for (int neighbor :
                    graph.get(i)) {

                reversed.get(neighbor)
                        .add(i);
            }
        }

        boolean[] visited =
                new boolean[vertices];

        Stack<Integer> stack =
                new Stack<>();

        for (int i = 0;
             i < vertices;
             i++) {

            if (!visited[i]) {

                dfs(
                        i,
                        visited,
                        stack,
                        graph
                );
            }
        }

        Arrays.fill(
                visited,
                false
        );

        while (!stack.isEmpty()) {

            int node = stack.pop();

            if (!visited[node]) {

                reverseDfs(
                        node,
                        visited,
                        reversed
                );

                System.out.println();
            }
        }
    }
}