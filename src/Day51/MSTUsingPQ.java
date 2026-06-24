package Day51;

import java.util.*;

public class MSTUsingPQ {

    static class Pair {

        int node;
        int weight;

        Pair(int node, int weight) {

            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Pair>>
                graph = new ArrayList<>();

        for (int i = 0;
             i < vertices;
             i++) {

            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Pair(1, 2));
        graph.get(1).add(new Pair(0, 2));

        graph.get(0).add(new Pair(3, 6));
        graph.get(3).add(new Pair(0, 6));

        graph.get(1).add(new Pair(2, 3));
        graph.get(2).add(new Pair(1, 3));

        graph.get(1).add(new Pair(3, 8));
        graph.get(3).add(new Pair(1, 8));

        graph.get(1).add(new Pair(4, 5));
        graph.get(4).add(new Pair(1, 5));

        graph.get(2).add(new Pair(4, 7));
        graph.get(4).add(new Pair(2, 7));

        boolean[] visited =
                new boolean[vertices];

        PriorityQueue<Pair> pq =
                new PriorityQueue<>(
                        Comparator.comparingInt(
                                a -> a.weight
                        )
                );

        pq.offer(new Pair(0, 0));

        int mstCost = 0;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            if (visited[current.node]) {

                continue;
            }

            visited[current.node] = true;

            mstCost += current.weight;

            for (Pair neighbor :
                    graph.get(current.node)) {

                if (!visited[neighbor.node]) {

                    pq.offer(neighbor);
                }
            }
        }

        System.out.println(mstCost);
    }
}