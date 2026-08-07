package Day95;

import java.util.Scanner;

public class MinimumBouquetDays {

    static boolean possible(int[] bloom, int m, int k, int day) {

        int flowers = 0;
        int bouquets = 0;

        for (int value : bloom) {

            if (value <= day) {

                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] bloom = new int[n];

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            bloom[i] = sc.nextInt();

            low = Math.min(low, bloom[i]);
            high = Math.max(high, bloom[i]);
        }

        int m = sc.nextInt();
        int k = sc.nextInt();

        if ((long) m * k > n) {
            System.out.println(-1);
            return;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (possible(bloom, m, k, mid))
                high = mid;
            else
                low = mid + 1;
        }

        System.out.println(low);
    }
}