package Day11;

public class MinimumProductPair {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 6, 7, 0};

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < min1) {
                min2 = min1;
                min1 = num;
            }

            else if (num < min2) {
                min2 = num;
            }
        }

        System.out.println("Minimum Product: "
                + (min1 * min2));
    }
}