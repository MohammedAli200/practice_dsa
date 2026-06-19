package Day46;

import java.util.*;

public class KruskalsAlgorithm {

    static class Edge {

        int source;
        int destination;
        int weight;

        Edge(
                int source,
                int destination,
                int weight) {

            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static int find(
            int node,
            int[] parent) {

        if (parent[node] == node) {

            return node;
        }

        return parent[node] =
                find(
                        parent[node],
                        parent
                );
    }

    static void union(
            int a,
            int b,
            int[] parent) {

        parent[
                find(a, parent)
                ] =
                find(b, parent);
    }

    public static void main(String[] args) {

        List<Edge> edges =
                new ArrayList<>();

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        edges.sort(
                Comparator.comparingInt(
                        edge -> edge.weight
                )
        );

        int[] parent =
                {0, 1, 2, 3};

        int mstCost = 0;

        for (Edge edge : edges) {

            int x =
                    find(
                            edge.source,
                            parent
                    );

            int y =
                    find(
                            edge.destination,
                            parent
                    );

            if (x != y) {

                mstCost += edge.weight;

                union(
                        edge.source,
                        edge.destination,
                        parent
                );
            }
        }

        System.out.println(mstCost);
    }
}