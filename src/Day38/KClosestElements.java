package Day38;

import java.util.*;

public class KClosestElements {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int k = 4;
        int x = 3;

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        (a, b) ->
                                Math.abs(b - x)
                                        - Math.abs(a - x)
                );

        for (int num : arr) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> result =
                new ArrayList<>(pq);

        Collections.sort(result);

        System.out.println(result);
    }
}