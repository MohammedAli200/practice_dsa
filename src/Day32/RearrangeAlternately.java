package Day32;

import java.util.*;

public class RearrangeAlternately {

    public static void main(String[] args) {

        int[] arr = {
                1, 2, 3, 4,
                5, 6
        };

        int[] result =
                new int[arr.length];

        int left = 0;
        int right =
                arr.length - 1;

        int index = 0;

        while (left <= right) {

            if (left != right) {

                result[index++] =
                        arr[right--];

                result[index++] =
                        arr[left++];

            } else {

                result[index++] =
                        arr[left++];
            }
        }

        System.out.println(
                Arrays.toString(result)
        );
    }
}