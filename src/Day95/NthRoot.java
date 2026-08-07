package Day95;

import java.util.Scanner;

public class NthRoot {

    static long power(long base, int exp) {

        long result = 1;

        for (int i = 0; i < exp; i++)
            result *= base;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int low = 1;
        int high = m;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long value = power(mid, n);

            if (value == m) {
                System.out.println(mid);
                return;
            }

            if (value < m)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println(-1);
    }
}