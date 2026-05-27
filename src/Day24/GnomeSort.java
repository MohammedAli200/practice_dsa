package Day24;

import java.util.*;

public class GnomeSort {
    public static void main(String[] args) {

        int[] arr = {
                34, 2, 10, -9
        };

        int index = 0;

        while (index < arr.length) {

            if (index == 0) {

                index++;

            } else if (arr[index]
                    >= arr[index - 1]) {

                index++;

            } else {

                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;

                index--;
            }
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}