package Day96;

import java.util.Scanner;

public class FindDuplicateNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++)
            arr[i] = sc.nextInt();

        int low = 1;
        int high = n;

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            for (int num : arr) {
                if (num <= mid)
                    count++;
            }

            if (count > mid)
                high = mid;
            else
                low = mid + 1;
        }

        System.out.println("Duplicate = " + low);
    }
}