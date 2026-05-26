package Day23;

import java.util.*;

public class CountingSort {
    public static void main(String[] args) {

        int[] arr = {
                4, 2, 2, 8, 3, 3, 1
        };

        int max = arr[0];

        for (int num : arr) {

            max = Math.max(max, num);
        }

        int[] count =
                new int[max + 1];

        for (int num : arr) {

            count[num]++;
        }

        int index = 0;

        for (int i = 0;
             i < count.length;
             i++) {

            while (count[i] > 0) {

                arr[index++] = i;
                count[i]--;
            }
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}