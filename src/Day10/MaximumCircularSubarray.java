package Day10;

public class MaximumCircularSubarray {

    static int kadane(int[] arr) {

        int maxEnding = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            maxEnding = Math.max(arr[i],
                    maxEnding + arr[i]);

            result = Math.max(result,
                    maxEnding);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {8, -4, 3, -5, 4};

        int normalMax = kadane(arr);

        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            arr[i] = -arr[i];
        }

        int circularMax = total + kadane(arr);

        System.out.println(Math.max(normalMax,
                circularMax));
    }
}