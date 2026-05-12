package Day9;

import java.util.*;

public class MajorityElementNby3 {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 2, 2, 1, 1};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num,
                    map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {

            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}