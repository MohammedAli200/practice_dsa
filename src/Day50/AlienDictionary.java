package Day50;

import java.util.*;

public class AlienDictionary {

    public static void main(String[] args) {

        String[] words = {
                "baa",
                "abcd",
                "abca",
                "cab",
                "cad"
        };

        int k = 4;

        ArrayList<ArrayList<Integer>>
                graph = new ArrayList<>();

        for (int i = 0; i < k; i++) {

            graph.add(new ArrayList<>());
        }

        int[] indegree =
                new int[k];

        for (int i = 0;
             i < words.length - 1;
             i++) {

            String first = words[i];
            String second = words[i + 1];

            int len =
                    Math.min(
                            first.length(),
                            second.length()
                    );

            for (int j = 0;
                 j < len;
                 j++) {

                if (first.charAt(j)
                        != second.charAt(j)) {

                    int u =
                            first.charAt(j) - 'a';

                    int v =
                            second.charAt(j) - 'a';

                    graph.get(u).add(v);

                    indegree[v]++;

                    break;
                }
            }
        }

        Queue<Integer> queue =
                new LinkedList<>();

        for (int i = 0; i < k; i++) {

            if (indegree[i] == 0) {

                queue.offer(i);
            }
        }

        StringBuilder order =
                new StringBuilder();

        while (!queue.isEmpty()) {

            int node = queue.poll();

            order.append(
                    (char) (node + 'a')
            );

            for (int neighbor
                    : graph.get(node)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {

                    queue.offer(neighbor);
                }
            }
        }

        System.out.println(order);
    }
}