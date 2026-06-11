package Day38;

import java.util.*;

public class MergeKSortedArrays {

    static class Node {

        int value;
        int row;
        int col;

        Node(int value,
             int row,
             int col) {

            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {

        int[][] arrays = {
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };

        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                        Comparator.comparingInt(
                                a -> a.value
                        )
                );

        for (int i = 0;
             i < arrays.length;
             i++) {

            pq.offer(
                    new Node(
                            arrays[i][0],
                            i,
                            0
                    )
            );
        }

        List<Integer> result =
                new ArrayList<>();

        while (!pq.isEmpty()) {

            Node current =
                    pq.poll();

            result.add(
                    current.value
            );

            if (current.col + 1
                    < arrays[current.row].length) {

                pq.offer(
                        new Node(
                                arrays[current.row]
                                        [current.col + 1],
                                current.row,
                                current.col + 1
                        )
                );
            }
        }

        System.out.println(result);
    }
}