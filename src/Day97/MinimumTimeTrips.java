package Day97;

import java.util.Scanner;

public class MinimumTimeTrips {

    static boolean possible(int[] time, long trips, long currentTime) {

        long completed = 0;

        for (int t : time) {

            completed += currentTime / t;

            if (completed >= trips)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] time = new int[n];

        long low = 1;
        long high = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
            high = Math.min(high, time[i]);
        }

        long trips = sc.nextLong();

        high *= trips;

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (possible(time, trips, mid))
                high = mid;
            else
                low = mid + 1;
        }

        System.out.println(low);
    }
}