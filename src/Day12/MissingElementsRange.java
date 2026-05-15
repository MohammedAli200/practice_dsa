package Day12;

import java.util.*;

public class MissingElementsRange {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();

        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        Set<Integer> set =
                new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int i = min;
             i <= max;
             i++) {

            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}