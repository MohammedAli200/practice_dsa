package day27;

import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] arr = {
                100, 4, 200,
                1, 3, 2
        };

        Set<Integer> set =
                new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {

                    current++;
                    streak++;
                }

                longest = Math.max(
                        longest,
                        streak
                );
            }
        }

        System.out.println(
                "Longest Sequence Length: "
                        + longest
        );
    }
}