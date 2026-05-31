package Day28;

import java.util.*;

public class MaximumSumPair {
    public static void main(String[] args) {

        int[] arr = {
                12, 34, 10, 6, 40
        };

        Arrays.sort(arr);

        int sum =
                arr[arr.length - 1]
                        + arr[arr.length - 2];

        System.out.println(
                "Maximum Pair Sum = "
                        + sum
        );
    }
}