package Day95;

import java.util.Scanner;

public class SplitArrayLargestSum {

    static boolean possible(int[] arr, int k, int limit) {

        int count = 1;
        int sum = 0;

        for (int num : arr) {

            if (sum + num <= limit) {
                sum += num;
            } else {
                count++;
                sum = num;

                if (count > k)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int low = 0, high = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        int k = sc.nextInt();

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (possible(arr, k, mid))
                high = mid;
            else
                low = mid + 1;
        }

        System.out.println(low);
    }
}