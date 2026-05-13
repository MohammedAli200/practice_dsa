package Day10;

public class MaxSumKConsecutive {
    public static void main(String[] args) {

        int[] arr = {1, 8, 30, -5, 20, 7};
        int k = 3;

        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < arr.length; i++) {

            currentSum += arr[i] - arr[i - k];

            maxSum = Math.max(maxSum,
                    currentSum);
        }

        System.out.println("Maximum Sum: "
                + maxSum);
    }
}