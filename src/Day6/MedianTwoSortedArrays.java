package Day6;

import java.util.*;

public class MedianTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        int[] merged = new int[arr1.length + arr2.length];

        int k = 0;

        for (int num : arr1) {
            merged[k++] = num;
        }

        for (int num : arr2) {
            merged[k++] = num;
        }

        Arrays.sort(merged);

        int n = merged.length;

        double median;

        if (n % 2 == 0) {
            median = (merged[n/2] + merged[n/2 - 1]) / 2.0;
        } else {
            median = merged[n/2];
        }

        System.out.println("Median: " + median);
    }
}