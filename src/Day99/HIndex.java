package Day99;

import java.util.Scanner;

public class HIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] citations = new int[n];

        for (int i = 0; i < n; i++)
            citations[i] = sc.nextInt();

        int low = 0;
        int high = n;

        while (low < high) {

            int mid = low + (high - low + 1) / 2;

            int index = n - mid;

            if (citations[index] >= mid)
                low = mid;
            else
                high = mid - 1;
        }

        System.out.println("H-Index = " + low);
    }
}