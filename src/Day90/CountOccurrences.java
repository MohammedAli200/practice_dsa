package Day90;

import java.util.Scanner;

public class CountOccurrences {

    static int firstOccurrence(int[] arr, int key) {

        int low = 0, high = arr.length - 1;
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                answer = mid;
                high = mid - 1;
            }
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return answer;
    }

    static int lastOccurrence(int[] arr, int key) {

        int low = 0, high = arr.length - 1;
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                answer = mid;
                low = mid + 1;
            }
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();

        int first = firstOccurrence(arr, key);

        if (first == -1) {
            System.out.println("Occurrences = 0");
            return;
        }

        int last = lastOccurrence(arr, key);

        System.out.println("Occurrences = " + (last - first + 1));
    }
}