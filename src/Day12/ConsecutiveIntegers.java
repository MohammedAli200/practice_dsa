package Day12;

import java.util.*;

public class ConsecutiveIntegers {
    public static void main(String[] args) {

        int[] arr = {5, 4, 2, 3, 1};

        Arrays.sort(arr);

        boolean consecutive = true;

        for (int i = 1;
             i < arr.length;
             i++) {

            if (arr[i]
                    != arr[i - 1] + 1) {

                consecutive = false;
                break;
            }
        }

        System.out.println(consecutive
                ? "Consecutive"
                : "Not Consecutive");
    }
}