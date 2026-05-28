package Day25;

import java.util.*;

public class PairGivenSum {
    public static void main(String[] args) {

        int[] arr = {
                2, 7, 11, 15
        };

        int target = 9;

        Set<Integer> set =
                new HashSet<>();

        for (int num : arr) {

            int complement =
                    target - num;

            if (set.contains(complement)) {

                System.out.println(
                        "Pair Found: "
                                + complement
                                + " "
                                + num
                );

                return;
            }

            set.add(num);
        }

        System.out.println(
                "No Pair Found"
        );
    }
}