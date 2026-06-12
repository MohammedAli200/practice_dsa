package Day39;

import java.util.*;

public class MaxOfMinWindow {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 50, 10, 70, 30};

        int n = arr.length;

        for (int k = 1; k <= n; k++) {

            int maxMin = Integer.MIN_VALUE;

            for (int i = 0; i <= n - k; i++) {

                int min = Integer.MAX_VALUE;

                for (int j = i; j < i + k; j++) {

                    min = Math.min(min, arr[j]);
                }

                maxMin = Math.max(maxMin, min);
            }

            System.out.print(maxMin + " ");
        }
    }
}