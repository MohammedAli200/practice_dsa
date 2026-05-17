package Day14;

import java.util.*;

public class MedianTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        int[] merged =
                new int[arr1.length
                        + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length
                && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                merged[k++] = arr1[i++];

            } else {

                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        int n = merged.length;

        double median;

        if (n % 2 == 0) {

            median =
                    (merged[n / 2]
                            + merged[n / 2 - 1])
                            / 2.0;

        } else {

            median = merged[n / 2];
        }

        System.out.println(
                "Median: "
                        + median
        );
    }
}