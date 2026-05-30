package day27;

public class MinimumSumSubarray {
    public static void main(String[] args) {

        int[] arr = {
                3, -4, 2, -3,
                -1, 7, -5
        };

        int minSoFar = arr[0];
        int current = arr[0];

        for (int i = 1; i < arr.length; i++) {

            current = Math.min(
                    arr[i],
                    current + arr[i]
            );

            minSoFar = Math.min(
                    minSoFar,
                    current
            );
        }

        System.out.println(
                "Minimum Sum: " + minSoFar
        );
    }
}