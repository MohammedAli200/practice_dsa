package Day5;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                System.out.println("Subarray Found: " + start + " to " + end);
            }
        }
    }
}