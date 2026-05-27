package Day24;

import java.util.*;

public class OddEvenSort {
    public static void main(String[] args) {

        int[] arr = {
                34, 2, 10, -9
        };

        boolean sorted = false;

        while (!sorted) {

            sorted = true;

            for (int i = 1;
                 i <= arr.length - 2;
                 i += 2) {

                if (arr[i]
                        > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    sorted = false;
                }
            }

            for (int i = 0;
                 i <= arr.length - 2;
                 i += 2) {

                if (arr[i]
                        > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    sorted = false;
                }
            }
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}