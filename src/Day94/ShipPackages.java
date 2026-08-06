package Day94;

import java.util.Scanner;

public class ShipPackages {

    static boolean possible(int[] weights, int days, int cap) {

        int required = 1;
        int load = 0;

        for (int w : weights) {

            if (load + w > cap) {

                required++;
                load = 0;
            }

            load += w;
        }

        return required <= days;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] weights = new int[n];

        int low = 0;
        int high = 0;

        for (int i = 0; i < n; i++) {

            weights[i] = sc.nextInt();

            low = Math.max(low, weights[i]);

            high += weights[i];
        }

        int days = sc.nextInt();

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (possible(weights, days, mid))
                high = mid;
            else
                low = mid + 1;
        }

        System.out.println(low);
    }
}