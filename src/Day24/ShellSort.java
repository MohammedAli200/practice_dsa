package Day24;

import java.util.*;

public class ShellSort {
    public static void main(String[] args) {

        int[] arr = {
                12, 34, 54, 2, 3
        };

        int n = arr.length;

        for (int gap = n / 2;
             gap > 0;
             gap /= 2) {

            for (int i = gap;
                 i < n;
                 i++) {

                int temp = arr[i];
                int j = i;

                while (j >= gap
                        && arr[j - gap] > temp) {

                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}