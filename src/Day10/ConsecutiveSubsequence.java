package Day10;

import java.util.*;

public class ConsecutiveSubsequence {
    public static void main(String[] args) {

        int[] arr = {1, 9, 3, 10, 4, 20, 2};

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest,
                        count);
            }
        }

        System.out.println("Longest Length: "
                + longest);
    }
}
