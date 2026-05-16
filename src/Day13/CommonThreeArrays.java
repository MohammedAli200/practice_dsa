package Day13;

import java.util.*;

public class CommonThreeArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {

            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        for (int num : arr3) {

            if (set2.contains(num)) {
                System.out.println(num);
            }
        }
    }
}