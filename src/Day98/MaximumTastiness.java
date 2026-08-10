package Day98;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumTastiness {

    static boolean canChoose(int[] price, int k, int distance) {

        int count = 1;
        int last = price[0];

        for (int i = 1; i < price.length; i++) {

            if (price[i] - last >= distance) {
                count++;
                last = price[i];

                if (count >= k)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] price = new int[n];

        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();

        int k = sc.nextInt();

        Arrays.sort(price);

        int low = 0;
        int high = price[n - 1] - price[0];

        int answer = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canChoose(price, k, mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Maximum Tastiness = " + answer);
    }
}