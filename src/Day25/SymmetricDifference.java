package Day25;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {

        int[] arr1 = {
                1, 2, 3
        };

        int[] arr2 = {
                3, 4, 5
        };

        Set<Integer> set1 =
                new HashSet<>();

        Set<Integer> set2 =
                new HashSet<>();

        for (int num : arr1) {

            set1.add(num);
        }

        for (int num : arr2) {

            set2.add(num);
        }

        Set<Integer> result =
                new HashSet<>(set1);

        result.addAll(set2);

        Set<Integer> temp =
                new HashSet<>(set1);

        temp.retainAll(set2);

        result.removeAll(temp);

        System.out.println(
                "Symmetric Difference: "
                        + result
        );
    }
}