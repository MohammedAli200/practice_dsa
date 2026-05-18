package Day15;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int start = 0;
        int currentSum = 0;

        for (int end = 0;
             end < arr.length;
             end++) {

            currentSum += arr[end];

            while (currentSum > target
                    && start < end) {

                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {

                System.out.println(
                        "Subarray Found from "
                                + start
                                + " to "
                                + end
                );

                return;
            }
        }

        System.out.println("No Subarray");
    }
}