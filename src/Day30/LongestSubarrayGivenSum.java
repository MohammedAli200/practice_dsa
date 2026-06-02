package Day30;

import java.util.*;

public class LongestSubarrayGivenSum {

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, 9};
        int target = 15;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == target) {
                maxLength = i + 1;
            }

            if (map.containsKey(sum - target)) {
                maxLength = Math.max(
                        maxLength,
                        i - map.get(sum - target)
                );
            }

            map.putIfAbsent(sum, i);
        }

        System.out.println(maxLength);
    }
}