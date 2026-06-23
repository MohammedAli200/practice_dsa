package Day50;

import java.util.*;

class Node {

    int value;

    List<Node> neighbors;

    Node(int value) {

        this.value = value;

        neighbors =
                new ArrayList<>();
    }
}

public class CloneGraph {

    static Node cloneGraph(
            Node node,
            Map<Node, Node> map) {

        if (node == null) {

            return null;
        }

        if (map.containsKey(node)) {

            return map.get(node);
        }

        Node clone =
                new Node(node.value);

        map.put(node, clone);

        for (Node neighbor
                : node.neighbors) {

            clone.neighbors.add(
                    cloneGraph(
                            neighbor,
                            map
                    )
            );
        }

        return clone;
    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);

        node1.neighbors.add(node2);
        node2.neighbors.add(node1);

        Node cloned =
                cloneGraph(
                        node1,
                        new HashMap<>()
                );

        System.out.println(
                cloned.value
        );
    }
}