package Day25;

import java.util.*;

public class DifferenceArrays {
    public static void main(String[] args) {

        int[] arr1 = {
                1, 2, 3, 4
        };

        int[] arr2 = {
                3, 4, 5, 6
        };

        Set<Integer> set =
                new HashSet<>();

        for (int num : arr2) {

            set.add(num);
        }

        System.out.print(
                "Difference: "
        );

        for (int num : arr1) {

            if (!set.contains(num)) {

                System.out.print(
                        num + " "
                );
            }
        }
    }
}