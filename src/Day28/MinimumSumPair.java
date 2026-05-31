package Day28;

import java.util.*;

public class MinimumSumPair {
    public static void main(String[] args) {

        int[] arr = {
                12, 34, 10, 6, 40
        };

        Arrays.sort(arr);

        int sum =
                arr[0]
                        + arr[1];

        System.out.println(
                "Minimum Pair Sum = "
                        + sum
        );
    }
}