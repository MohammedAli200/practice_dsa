package Day48;

import java.util.*;

public class BipartiteGraph {

    static boolean bfs(
            int start,
            int[] color,
            ArrayList<ArrayList<Integer>> graph) {

        Queue<Integer> queue =
                new LinkedList<>();

        queue.offer(start);

        color[start] = 0;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            for (int neighbor :
                    graph.get(node)) {

                if (color[neighbor] == -1) {

                    color[neighbor] =
                            1 - color[node];

                    queue.offer(neighbor);

                } else if (
                        color[neighbor]
                                == color[node]) {

                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {

            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(0);
        graph.get(0).add(3);

        int[] color =
                new int[vertices];

        Arrays.fill(color, -1);

        System.out.println(
                bfs(
                        0,
                        color,
                        graph
                )
        );
    }
}
