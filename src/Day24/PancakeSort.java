package Day24;

import java.util.*;

public class PancakeSort {

    static void flip(int[] arr, int i) {

        int start = 0;

        while (start < i) {

            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;

            start++;
            i--;
        }
    }

    static int findMax(int[] arr, int n) {

        int maxIndex = 0;

        for (int i = 1;
             i < n;
             i++) {

            if (arr[i]
                    > arr[maxIndex]) {

                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {

        int[] arr = {
                3, 6, 1, 10, 2
        };

        for (int currSize =
             arr.length;
             currSize > 1;
             currSize--) {

            int maxIndex =
                    findMax(arr,
                            currSize);

            if (maxIndex
                    != currSize - 1) {

                flip(arr, maxIndex);

                flip(arr,
                        currSize - 1);
            }
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}