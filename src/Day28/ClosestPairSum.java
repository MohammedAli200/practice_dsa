package Day28;

import java.util.*;

public class ClosestPairSum {
    public static void main(String[] args) {

        int[] arr = {
                10, 22, 28,
                29, 30, 40
        };

        int target = 54;

        int left = 0;
        int right =
                arr.length - 1;

        int minDiff =
                Integer.MAX_VALUE;

        int a = 0;
        int b = 0;

        while (left < right) {

            int sum =
                    arr[left]
                            + arr[right];

            int diff =
                    Math.abs(
                            target - sum
                    );

            if (diff < minDiff) {

                minDiff = diff;
                a = arr[left];
                b = arr[right];
            }

            if (sum < target) {

                left++;

            } else {

                right--;
            }
        }

        System.out.println(
                "Closest Pair = "
                        + a
                        + ", "
                        + b
        );
    }
}