package Day98;

import java.util.Scanner;

public class MedianTwoSortedArrays {

    public static double findMedian(int[] a, int[] b) {

        if (a.length > b.length)
            return findMedian(b, a);

        int n = a.length;
        int m = b.length;

        int low = 0;
        int high = n;

        while (low <= high) {

            int partitionA = low + (high - low) / 2;
            int partitionB = (n + m + 1) / 2 - partitionA;

            int leftA = partitionA == 0
                    ? Integer.MIN_VALUE
                    : a[partitionA - 1];

            int rightA = partitionA == n
                    ? Integer.MAX_VALUE
                    : a[partitionA];

            int leftB = partitionB == 0
                    ? Integer.MIN_VALUE
                    : b[partitionB - 1];

            int rightB = partitionB == m
                    ? Integer.MAX_VALUE
                    : b[partitionB];

            if (leftA <= rightB && leftB <= rightA) {

                if ((n + m) % 2 == 0) {

                    return (Math.max(leftA, leftB)
                            + Math.min(rightA, rightB)) / 2.0;

                } else {

                    return Math.max(leftA, leftB);
                }
            }

            if (leftA > rightB)
                high = partitionA - 1;
            else
                low = partitionA + 1;
        }

        return 0.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        double median = findMedian(a, b);

        System.out.println("Median = " + median);
    }
}