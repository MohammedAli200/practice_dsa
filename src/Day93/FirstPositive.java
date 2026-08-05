package Day93;

import java.util.Scanner;

public class FirstPositive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int low = 0, high = n - 1;
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > 0) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("First Positive Index = " + answer);
    }
}