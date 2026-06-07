package Day34;

public class MaximumCircularSubarray {

    static int kadane(int[] arr) {

        int maxSum = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.max(
                    arr[i],
                    current + arr[i]
            );

            maxSum = Math.max(
                    maxSum,
                    current
            );
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {5, -2, 3, 4};

        int normalMax = kadane(arr);

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {

            totalSum += arr[i];
            arr[i] = -arr[i];
        }

        int circularMax =
                totalSum + kadane(arr);

        System.out.println(
                Math.max(normalMax,
                        circularMax)
        );
    }
}
