package Day15;

public class LongestCommonSpan {
    public static void main(String[] args) {

        int[] arr1 = {0, 1, 0, 0, 0, 0};
        int[] arr2 = {1, 0, 1, 0, 0, 1};

        int maxLength = 0;

        for (int i = 0; i < arr1.length; i++) {

            int sum1 = 0;
            int sum2 = 0;

            for (int j = i;
                 j < arr1.length;
                 j++) {

                sum1 += arr1[j];
                sum2 += arr2[j];

                if (sum1 == sum2) {

                    maxLength =
                            Math.max(maxLength,
                                    j - i + 1);
                }
            }
        }

        System.out.println(
                "Maximum Length: "
                        + maxLength
        );
    }
}