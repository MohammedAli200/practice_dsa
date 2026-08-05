package Day93;

import java.util.Scanner;

public class NearlySortedSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();

        int low = 0, high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                System.out.println("Element Found at Index " + mid);
                return;
            }

            if (mid > low && arr[mid - 1] == key) {
                System.out.println("Element Found at Index " + (mid - 1));
                return;
            }

            if (mid < high && arr[mid + 1] == key) {
                System.out.println("Element Found at Index " + (mid + 1));
                return;
            }

            if (arr[mid] > key)
                high = mid - 2;
            else
                low = mid + 2;
        }

        System.out.println("Element Not Found");
    }
}