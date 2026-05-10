package Day7;

import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {

        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < arr.length; i++) {

            int diff = arr[i + m - 1] - arr[i];

            minDiff = Math.min(minDiff, diff);
        }

        System.out.println("Minimum Difference: " + minDiff);
    }
}