package Day9;

import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println("Kth Largest: " + pq.peek());
    }
}