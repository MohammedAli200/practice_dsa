package Day38;

import java.util.*;

public class KthLargestStream {

    public static void main(String[] args) {

        int[] stream =
                {4,5,8,2,3,10};

        int k = 3;

        PriorityQueue<Integer> pq =
                new PriorityQueue<>();

        for (int num : stream) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }

            System.out.println(
                    "Kth Largest = "
                            + pq.peek()
            );
        }
    }
}