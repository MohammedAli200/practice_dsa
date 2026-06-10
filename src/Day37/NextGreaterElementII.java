package Day37;

import java.util.*;

public class NextGreaterElementII {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int n = nums.length;

        int[] result = new int[n];

        Arrays.fill(result, -1);

        Stack<Integer> stack =
                new Stack<>();

        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!stack.isEmpty()
                    && nums[index]
                    > nums[stack.peek()]) {

                result[stack.pop()] =
                        nums[index];
            }

            if (i < n) {
                stack.push(index);
            }
        }

        System.out.println(
                Arrays.toString(result)
        );
    }
}