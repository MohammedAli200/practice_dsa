package Day15;

public class MaximumIndexDifference {
    public static void main(String[] args) {

        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};

        int maxDiff = -1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr.length - 1;
                 j > i;
                 j--) {

                if (arr[j] > arr[i]) {

                    maxDiff =
                            Math.max(maxDiff,
                                    j - i);

                    break;
                }
            }
        }

        System.out.println(
                "Maximum Difference: "
                        + maxDiff
        );
    }
}