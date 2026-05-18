package Day15;

public class MinimumDistance {
    public static void main(String[] args) {

        int[] arr =
                {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};

        int x = 3;
        int y = 6;

        int previous = -1;
        int minDistance =
                Integer.MAX_VALUE;

        for (int i = 0;
             i < arr.length;
             i++) {

            if (arr[i] == x
                    || arr[i] == y) {

                if (previous != -1
                        && arr[i]
                        != arr[previous]) {

                    minDistance =
                            Math.min(minDistance,
                                    i - previous);
                }

                previous = i;
            }
        }

        System.out.println(
                "Minimum Distance: "
                        + minDistance
        );
    }
}