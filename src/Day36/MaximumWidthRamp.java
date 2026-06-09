package Day36;

import java.util.*;

public class MaximumWidthRamp {

    public static void main(String[] args) {

        int[] nums = {6, 0, 8, 2, 1, 5};

        Stack<Integer> stack =
                new Stack<>();

        for (int i = 0; i < nums.length; i++) {

            if (stack.isEmpty()
                    || nums[i] < nums[stack.peek()]) {

                stack.push(i);
            }
        }

        int maxWidth = 0;

        for (int i = nums.length - 1;
             i >= 0;
             i--) {

            while (!stack.isEmpty()
                    && nums[i] >= nums[stack.peek()]) {

                maxWidth =
                        Math.max(
                                maxWidth,
                                i - stack.pop()
                        );
            }
        }

        System.out.println(maxWidth);
    }
}