package Day12;

public class MaximumDifferenceElements {
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        int minElement = arr[0];
        int maxDifference = 0;

        for (int i = 1;
             i < arr.length;
             i++) {

            maxDifference =
                    Math.max(maxDifference,
                            arr[i] - minElement);

            minElement =
                    Math.min(minElement,
                            arr[i]);
        }

        System.out.println(
                "Maximum Difference: "
                        + maxDifference
        );
    }
}
