package Day95;

import java.util.Scanner;

public class SmallestDivisor {

    static boolean possible(int[] arr, int threshold, int divisor) {

        int sum = 0;

        for (int num : arr)
            sum += (num + divisor - 1) / divisor;

        return sum <= threshold;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int high = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            high = Math.max(high, arr[i]);
        }

        int threshold = sc.nextInt();

        int low = 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (possible(arr, threshold, mid))
                high = mid;
            else
                low = mid + 1;
        }

        System.out.println(low);
    }
}