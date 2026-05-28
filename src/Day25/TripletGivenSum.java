package Day25;

import java.util.*;

public class TripletGivenSum {
    public static void main(String[] args) {

        int[] arr = {
                1, 4, 45, 6, 10, 8
        };

        int target = 22;

        Arrays.sort(arr);

        boolean found = false;

        for (int i = 0;
             i < arr.length - 2;
             i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum =
                        arr[i]
                                + arr[left]
                                + arr[right];

                if (sum == target) {

                    System.out.println(
                            "Triplet: "
                                    + arr[i]
                                    + " "
                                    + arr[left]
                                    + " "
                                    + arr[right]
                    );

                    found = true;
                    break;
                }

                if (sum < target) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        if (!found) {

            System.out.println(
                    "No Triplet Found"
            );
        }
    }
}