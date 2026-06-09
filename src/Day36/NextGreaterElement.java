package Day36;

import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] nums = {4, 5, 2, 25};

        Stack<Integer> stack =
                new Stack<>();

        int[] result =
                new int[nums.length];

        for (int i = nums.length - 1;
             i >= 0;
             i--) {

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