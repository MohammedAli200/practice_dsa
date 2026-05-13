package Day10;

import java.util.*;

public class DistinctWindow {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        for (int i = 0; i <= arr.length - k; i++) {

            Set<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(arr[j]);
            }

            System.out.print(set.size() + " ");
        }
    }
}