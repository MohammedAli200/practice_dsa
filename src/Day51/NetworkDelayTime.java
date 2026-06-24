package Day51;

import java.util.*;

public class NetworkDelayTime {

    static class Pair {

        int node;
        int time;

        Pair(int node, int time) {

            this.node = node;
            this.time = time;
        }
    }

    public static void main(String[] args) {

        int[][] times = {
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };

        int n = 4;
        int source = 2;

        ArrayList<ArrayList<Pair>>
                graph = new ArrayList<>();

        for (int i = 0;
             i <= n;
             i++) {

            graph.add(new ArrayList<>());
        }

        for (int[] edge : times) {

            graph.get(edge[0]).add(
                    new Pair(
                            edge[1],
                            edge[2]
                    )
            );
        }

        int[] dist =
                new int[n + 1];

        Arrays.fill(
                dist,
                Integer.MAX_VALUE
        );

        dist[source] = 0;

        PriorityQueue<Pair> pq =
                new PriorityQueue<>(
                        Comparator.comparingInt(
                                a -> a.time
                        )
                );

        pq.offer(
                new Pair(source, 0)
        );

        while (!pq.isEmpty()) {

            Pair current =
                    pq.poll();

            for (Pair neighbor :
                    graph.get(current.node)) {

                if (dist[current.node]
                        + neighbor.time
                        < dist[neighbor.node]) {

                    dist[neighbor.node] =
                            dist[current.node]
                                    + neighbor.time;

                    pq.offer(
                            new Pair(
                                    neighbor.node,
                                    dist[neighbor.node]
                            )
                    );
                }
            }
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i]
                    == Integer.MAX_VALUE) {

                System.out.println(-1);
                return;
            }

            answer =
                    Math.max(
                            answer,
                            dist[i]
                    );
        }

        System.out.println(answer);
    }
}