package Day15;

public class TrappingRainWater {
    public static void main(String[] args) {

        int[] arr =
                {3, 0, 1, 2, 5};

        int water = 0;

        for (int i = 1;
             i < arr.length - 1;
             i++) {

            int leftMax = arr[i];
            int rightMax = arr[i];

            for (int j = 0;
                 j < i;
                 j++) {

                leftMax =
                        Math.max(leftMax,
                                arr[j]);
            }

            for (int j = i + 1;
                 j < arr.length;
                 j++) {

                rightMax =
                        Math.max(rightMax,
                                arr[j]);
            }

            water +=
                    Math.min(leftMax,
                            rightMax)
                            - arr[i];
        }

        System.out.println(
                "Trapped Water: "
                        + water
        );
    }
}