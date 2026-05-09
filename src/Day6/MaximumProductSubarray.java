package Day6;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};

        int max = arr[0];
        int min = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = max;

            max = Math.max(arr[i],
                    Math.max(max * arr[i], min * arr[i]));

            min = Math.min(arr[i],
                    Math.min(temp * arr[i], min * arr[i]));

            result = Math.max(result, max);
        }

        System.out.println("Maximum Product: " + result);
    }
}