package Day36;

import java.util.*;

public class PreviousGreaterElement {

    public static void main(String[] args) {

        int[] nums = {15, 10, 18, 12, 4, 6, 2, 8};

        Stack<Integer> stack =
                new Stack<>();

        int[] result =
                new int[nums.length];

        for (int i = 0;
             i < nums.length;
             i++) {

            while (!stack.isEmpty()
                    && stack.peek() <= nums[i]) {

                stack.pop();
            }

            result[i] =
                    stack.isEmpty()
                            ? -1
                            : stack.peek();

            stack.push(nums[i]);
        }

        System.out.println(
                Arrays.toString(result)
        );
    }
}