package Day4;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 5, 7, 9};
        int[] c = {1, 3, 4, 5, 8};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : a) set1.add(num);
        for (int num : b) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        for (int num : c) {
            if (set2.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}