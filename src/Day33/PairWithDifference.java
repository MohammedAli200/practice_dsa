package Day33;

import java.util.*;

public class PairWithDifference {

    public static void main(String[] args) {

        int[] arr = {5, 20, 3, 2, 50, 80};

        int diff = 78;

        Arrays.sort(arr);

        int left = 0;
        int right = 1;

        while (right < arr.length) {

            int current =
                    arr[right] - arr[left];

            if (current == diff) {

                System.out.println(
                        arr[left]
                                + " "
                                + arr[right]
                );

                return;

            } else if (current < diff) {

                right++;

            } else {

                left++;
            }
        }

        System.out.println("Not Found");
    }
}