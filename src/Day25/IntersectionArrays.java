package Day25;

import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {

        int[] arr1 = {
                1, 2, 3, 4
        };

        int[] arr2 = {
                3, 4, 5, 6
        };

        Set<Integer> set =
                new HashSet<>();

        Set<Integer> intersection =
                new HashSet<>();

        for (int num : arr1) {

            set.add(num);
        }

        for (int num : arr2) {

            if (set.contains(num)) {

                intersection.add(num);
            }
        }

        System.out.println(
                "Intersection: "
                        + intersection
        );
    }
}