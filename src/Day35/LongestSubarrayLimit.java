package Day35;

import java.util.*;

public class LongestSubarrayLimit {

    public static void main(String[] args) {

        int[] nums = {8,2,4,7};
        int limit = 4;

        Deque<Integer> maxDeque =
                new LinkedList<>();

        Deque<Integer> minDeque =
                new LinkedList<>();

        int left = 0;
        int result = 0;

        for (int right = 0;
             right < nums.length;
             right++) {

            while (
                    !maxDeque.isEmpty()
                            &&
                            nums[maxDeque.peekLast()]
                                    < nums[right]
            ) {

                maxDeque.pollLast();
            }

            while (
                    !minDeque.isEmpty()
                            &&
                            nums[minDeque.peekLast()]
                                    > nums[right]
            ) {

                minDeque.pollLast();
            }

            maxDeque.offerLast(right);
            minDeque.offerLast(right);

            while (
                    nums[maxDeque.peekFirst()]
                            -
                            nums[minDeque.peekFirst()]
                            > limit
            ) {

                if (
                        maxDeque.peekFirst()
                                == left
                ) {

                    maxDeque.pollFirst();
                }

                if (
                        minDeque.peekFirst()
                                == left
                ) {

                    minDeque.pollFirst();
                }

                left++;
            }

            result =
                    Math.max(
                            result,
                            right - left + 1
                    );
        }

        System.out.println(result);
    }
}