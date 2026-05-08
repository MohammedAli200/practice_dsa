package Day5;

import java.util.*;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int target = 6;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int diff = target - num;

            if (map.containsKey(diff)) {
                count += map.get(diff);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Pairs Count: " + count);
    }
}