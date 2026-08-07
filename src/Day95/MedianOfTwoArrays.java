package Day95;

import java.util.Scanner;

public class MedianOfTwoArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if (a[i] < b[j])
                merged[k++] = a[i++];
            else
                merged[k++] = b[j++];
        }

        while (i < n1)
            merged[k++] = a[i++];

        while (j < n2)
            merged[k++] = b[j++];

        int size = merged.length;

        if (size % 2 == 0)
            System.out.println((merged[size / 2] + merged[size / 2 - 1]) / 2.0);
        else
            System.out.println(merged[size / 2]);
    }
}