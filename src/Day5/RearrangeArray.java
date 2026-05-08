package Day5;

import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            System.out.print(arr[right--] + " ");
            System.out.print(arr[left++] + " ");
        }

        if (left == right) {
            System.out.print(arr[left]);
        }
    }
}