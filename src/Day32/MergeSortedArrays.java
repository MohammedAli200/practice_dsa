package Day32;

import java.util.*;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        int n = arr1.length;
        int m = arr2.length;

        for (int i = m - 1; i >= 0; i--) {

            int last = arr1[n - 1];
            int j = n - 2;

            while (j >= 0 && arr1[j] > arr2[i]) {

                arr1[j + 1] = arr1[j];
                j--;
            }

            if (j != n - 2 || last > arr2[i]) {

                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}