package Day29;

public class MaximumAverageSubarray {

    public static void main(String[] args) {

        int[] arr = {
                1, 12, -5,
                -6, 50, 3
        };

        int k = 4;

        int sum = 0;

        for (int i = 0; i < k; i++) {

            sum += arr[i];
        }

        int maxSum = sum;

        for (int i = k;
             i < arr.length;
             i++) {

            sum += arr[i] - arr[i - k];

            maxSum = Math.max(
                    maxSum,
                    sum
            );
        }

        System.out.println(
                "Maximum Average = "
                        + (double) maxSum / k
        );
    }
}