package Day38;

import java.util.*;

public class MedianDataStream {

    public static void main(String[] args) {

        int[] stream =
                {5,15,1,3};

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(
                        Collections.reverseOrder()
                );

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        for (int num : stream) {

            maxHeap.offer(num);

            minHeap.offer(maxHeap.poll());

            if (maxHeap.size()
                    < minHeap.size()) {

                maxHeap.offer(
                        minHeap.poll()
                );
            }

            double median;

            if (maxHeap.size()
                    == minHeap.size()) {

                median =
                        (maxHeap.peek()
                                + minHeap.peek())
                                / 2.0;

            } else {

                median = maxHeap.peek();
            }

            System.out.println(
                    "Median = "
                            + median
            );
        }
    }
}
