package Day91;

import java.util.Scanner;

public class SquareRootBinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int low = 0;
        int high = n;
        int answer = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == n) {
                answer = mid;
                break;
            }

            if (square < n) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(answer);
    }
}