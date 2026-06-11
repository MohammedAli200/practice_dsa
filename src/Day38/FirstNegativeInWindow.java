package Day38;

import java.util.*;

public class FirstNegativeInWindow {

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};

        int k = 3;

        Queue<Integer> queue =
                new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                queue.offer(i);
            }

            if (i >= k - 1) {

                while (!queue.isEmpty()
                        && queue.peek() <= i - k) {

                    queue.poll();
                }

                if (queue.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(
                            arr[queue.peek()] + " "
                    );
                }
            }
        }
    }
}