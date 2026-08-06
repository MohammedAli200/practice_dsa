package Day94;

import java.util.Scanner;

public class InfiniteArraySearch {

    static int binarySearch(int[] arr, int low, int high, int key) {

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();

        int low = 0;
        int high = 1;

        while (high < n && arr[high] < key) {
            low = high;
            high *= 2;
        }

        if (high >= n)
            high = n - 1;

        System.out.println("Element Found at Index = " +
                binarySearch(arr, low, high, key));
    }
}