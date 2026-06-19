package Day46;

public class DisjointSetUnion {

    static int[] parent;

    static void makeSet(int n) {

        parent = new int[n];

        for (int i = 0; i < n; i++) {

            parent[i] = i;
        }
    }

    static int find(int node) {

        if (parent[node] == node) {

            return node;
        }

        return parent[node] =
                find(parent[node]);
    }

    static void union(
            int a,
            int b) {

        int rootA = find(a);
        int rootB = find(b);

        if (rootA != rootB) {

            parent[rootA] = rootB;
        }
    }

    public static void main(String[] args) {

        makeSet(5);

        union(0, 1);
        union(1, 2);

        System.out.println(
                find(0)
                        == find(2)
        );

        System.out.println(
                find(0)
                        == find(4)
        );
    }
}