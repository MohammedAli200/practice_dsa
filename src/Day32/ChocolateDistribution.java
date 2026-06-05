package Day32;

import java.util.*;

public class ChocolateDistribution {

    public static void main(String[] args) {

        int[] arr = {
                7, 3, 2, 4,
                9, 12, 56
        };

        int students = 3;

        Arrays.sort(arr);

        int minDiff =
                Integer.MAX_VALUE;

        for (int i = 0;
             i + students - 1 < arr.length;
             i++) {

            minDiff =
                    Math.min(
                            minDiff,
                            arr[i + students - 1]
                                    - arr[i]
                    );
        }

        System.out.println(
                "Minimum Difference = "
                        + minDiff
        );
    }
}