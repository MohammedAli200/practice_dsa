package Day51;

import java.util.*;

public class CheapestFlight {

    static class Node {

        int city;
        int cost;
        int stops;

        Node(
                int city,
                int cost,
                int stops) {

            this.city = city;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static void main(String[] args) {

        int[][] flights = {
                {0,1,100},
                {1,2,100},
                {0,2,500}
        };

        int n = 3;
        int src = 0;
        int dst = 2;
        int k = 1;

        ArrayList<ArrayList<int[]>>
                graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            graph.add(new ArrayList<>());
        }

        for (int[] flight : flights) {

            graph.get(flight[0])
                    .add(
                            new int[]{
                                    flight[1],
                                    flight[2]
                            }
                    );
        }

        Queue<Node> queue =
                new LinkedList<>();

        queue.offer(
                new Node(src, 0, 0)
        );

        int minCost =
                Integer.MAX_VALUE;

        while (!queue.isEmpty()) {

            Node current =
                    queue.poll();

            if (current.city == dst) {

                minCost =
                        Math.min(
                                minCost,
                                current.cost
                        );
            }

            if (current.stops > k) {

                continue;
            }

            for (int[] next :
                    graph.get(current.city)) {

                queue.offer(
                        new Node(
                                next[0],
                                current.cost
                                        + next[1],
                                current.stops + 1
                        )
                );
            }
        }

        System.out.println(
                minCost ==
                        Integer.MAX_VALUE
                        ? -1
                        : minCost
        );
    }
}