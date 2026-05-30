package day27;

import java.util.*;

public class RearrangePosNeg {
    public static void main(String[] args) {

        int[] arr = {
                -1, 2, -3, 4,
                -5, 6
        };

        List<Integer> positive =
                new ArrayList<>();

        List<Integer> negative =
                new ArrayList<>();

        for (int num : arr) {

            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        int i = 0, p = 0, n = 0;

        while (p < positive.size()
                && n < negative.size()) {

            arr[i++] = positive.get(p++);
            arr[i++] = negative.get(n++);
        }

        while (p < positive.size()) {
            arr[i++] = positive.get(p++);
        }

        while (n < negative.size()) {
            arr[i++] = negative.get(n++);
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}