package Day10;

import java.util.*;

public class PairClosestToZero {
    public static void main(String[] args) {

        int[] arr = {1, 60, -10, 70, -80, 85};

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int minSum = Integer.MAX_VALUE;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Closest Sum: " + minSum);
    }
}
