package day26;

public class LongestDecreasingSubarray {
    public static void main(String[] args) {

        int[] arr = {
                9, 8, 7, 6, 5, 10, 4
        };

        int maxLength = 1;
        int current = 1;

        for (int i = 1;
             i < arr.length;
             i++) {

            if (arr[i]
                    < arr[i - 1]) {

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
                "Longest Decreasing Subarray Length: "
                        + maxLength
        );
    }
}