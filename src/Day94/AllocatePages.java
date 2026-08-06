package Day94;

import java.util.Scanner;

public class AllocatePages {

    static boolean possible(int[] arr, int students, int limit) {

        int count = 1;
        int sum = 0;

        for (int pages : arr) {

            if (sum + pages <= limit)
                sum += pages;
            else {
                count++;
                sum = pages;

                if (count > students)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int low = 0;
        int high = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            low = Math.max(low, arr[i]);

            high += arr[i];
        }

        int students = sc.nextInt();

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possible(arr, students, mid)) {

                answer = mid;

                high = mid - 1;

            } else
                low = mid + 1;
        }

        System.out.println(answer);
    }
}