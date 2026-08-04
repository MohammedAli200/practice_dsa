package Day92;

import java.util.Scanner;

public class NextGreaterLetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] arr = new char[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next().charAt(0);

        char target = sc.next().charAt(0);

        int low = 0;
        int high = n - 1;

        char answer = arr[0];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                answer = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }
}