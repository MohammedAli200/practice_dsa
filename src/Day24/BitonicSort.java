package Day24;

import java.util.*;

public class BitonicSort {

    static void compare(int[] arr,
                        int i,
                        int j,
                        boolean dir) {

        if ((arr[i] > arr[j])
                == dir) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    static void merge(int[] arr,
                      int low,
                      int count,
                      boolean dir) {

        if (count > 1) {

            int k = count / 2;

            for (int i = low;
                 i < low + k;
                 i++) {

                compare(arr,
                        i,
                        i + k,
                        dir);
            }

            merge(arr,
                    low,
                    k,
                    dir);

            merge(arr,
                    low + k,
                    k,
                    dir);
        }
    }

    static void sort(int[] arr,
                     int low,
                     int count,
                     boolean dir) {

        if (count > 1) {

            int k = count / 2;

            sort(arr,
                    low,
                    k,
                    true);

            sort(arr,
                    low + k,
                    k,
                    false);

            merge(arr,
                    low,
                    count,
                    dir);
        }
    }

    public static void main(String[] args) {

        int[] arr = {
                3, 7, 4, 8,
                6, 2, 1, 5
        };

        sort(arr,
                0,
                arr.length,
                true);

        System.out.println(
                Arrays.toString(arr)
        );
    }
}