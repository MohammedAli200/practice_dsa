package Day12;

import java.util.*;

public class DuplicateUsingHashSet {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 5};

        Set<Integer> set =
                new HashSet<>();

        boolean duplicate = false;

        for (int num : arr) {

            if (!set.add(num)) {

                duplicate = true;
                System.out.println(
                        "Duplicate: " + num
                );
            }
        }

        if (!duplicate) {
            System.out.println(
                    "No Duplicates"
            );
        }
    }
}