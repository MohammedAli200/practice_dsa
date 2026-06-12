package Day39;

import java.util.*;

public class SmallestRangeKLists {

    static class Node {

        int value;
        int row;
        int col;

        Node(int value, int row, int col) {

            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {

        int[][] nums = {
                {4, 10, 15, 24, 26},
                {0, 9, 12, 20},
                {5, 18, 22, 30}
        };

        PriorityQueue<Node> minHeap =
                new PriorityQueue<>(
                        Comparator.comparingInt(a -> a.value)
                );

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            minHeap.offer(
                    new Node(nums[i][0], i, 0)
            );

            max = Math.max(max, nums[i][0]);
        }

        int start = 0;
        int end = Integer.MAX_VALUE;

        while (minHeap.size() == nums.length) {

            Node current = minHeap.poll();

            if (max - current.value < end - start) {

                start = current.value;
                end = max;
            }

            if (current.col + 1 < nums[current.row].length) {

                int next =
                        nums[current.row][current.col + 1];

                max = Math.max(max, next);

                minHeap.offer(
                        new Node(
                                next,
                                current.row,
                                current.col + 1
                        )
                );
            }
        }

        System.out.println(
                "Range = [" + start + ", " + end + "]"
        );
    }
}