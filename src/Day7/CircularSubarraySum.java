package Day7;

public class CircularSubarraySum {

    public static int kadane(int[] arr) {
        int maxSum = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            maxSum = Math.max(maxSum, current);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {5, -3, 5};

        int normalMax = kadane(arr);

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            arr[i] = -arr[i];
        }

        int circularMax = total + kadane(arr);

        System.out.println("Maximum Circular Sum: "
                + Math.max(normalMax, circularMax));
    }
}