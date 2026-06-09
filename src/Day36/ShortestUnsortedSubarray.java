package Day36;

import java.util.*;

public class ShortestUnsortedSubarray {

    public static void main(String[] args) {

        int[] nums = {2, 6, 4, 8, 10, 9, 15};

        int start = -1;
        int end = -2;

        int min = nums[nums.length - 1];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            max = Math.max(max, nums[i]);

            if (nums[i] < max) {
                end = i;
            }
        }

        for (int i = nums.length - 2; i >= 0; i--) {

            min = Math.min(min, nums[i]);

            if (nums[i] > min) {
                start = i;
            }
        }

        System.out.println(
                "Length = " + (end - start + 1)
        );
    }
}