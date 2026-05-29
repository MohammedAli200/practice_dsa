package day26;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {

        int[] arr = {
                1, 2, 2, 3, 4, 5, 1
        };

        int maxLength = 1;
        int current = 1;

        for (int i = 1;
             i < arr.length;
             i++) {

            if (arr[i]
                    > arr[i - 1]) {

                current++;

            } else {

                maxLength =
                        Math.max(
                                maxLength,
                                current
                        );

                current = 1;
            }
        }

        maxLength =
                Math.max(
                        maxLength,
                        current
                );

        System.out.println(
                "Longest Increasing Subarray Length: "
                        + maxLength
        );
    }
}