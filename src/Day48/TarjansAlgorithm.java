package Day48;

import java.util.*;

public class TarjansAlgorithm {

    static int timer = 0;

    static void dfs(
            int node,
            int[] disc,
            int[] low,
            boolean[] inStack,
            Stack<Integer> stack,
            ArrayList<ArrayList<Integer>> graph) {

        disc[node] = low[node] = ++timer;

        stack.push(node);
        inStack[node] = true;

        for (int neighbor : graph.get(node)) {

            if (disc[neighbor] == 0) {

                dfs(
                        neighbor,
                        disc,
                        low,
                        inStack,
                        stack,
                        graph
                );

                low[node] =
                        Math.min(
                                low[node],
                                low[neighbor]
                        );

            } else if (inStack[neighbor]) {

                low[node] =
                        Math.min(
                                low[node],
                                disc[neighbor]
                        );
            }
        }

        if (disc[node] == low[node]) {

            while (true) {

                int current = stack.pop();

                inStack[current] = false;

                System.out.print(
                        current + " "
                );

                if (current == node) {
                    break;
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {

            graph.add(new ArrayList<>());
        }

        graph.get(0).add(2);
        graph.get(2).add(1);
        graph.get(1).add(0);
        graph.get(0).add(3);
        graph.get(3).add(4);

        int[] disc = new int[vertices];
        int[] low = new int[vertices];

        boolean[] inStack =
                new boolean[vertices];

        Stack<Integer> stack =
                new Stack<>();

        for (int i = 0; i < vertices; i++) {

            if (disc[i] == 0) {

                dfs(
                        i,
                        disc,
                        low,
                        inStack,
                        stack,
                        graph
                );
            }
        }
    }
}