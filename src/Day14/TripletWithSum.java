package Day14;

import java.util.*;

public class TripletWithSum {
    public static void main(String[] args) {

        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 22;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum =
                        arr[i]
                                + arr[left]
                                + arr[right];

                if (sum == target) {

                    System.out.println(
                            arr[i]
                                    + " "
                                    + arr[left]
                                    + " "
                                    + arr[right]
                    );

                    return;
                }

                if (sum < target) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        System.out.println("No Triplet");
    }
}