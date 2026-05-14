package Day11;

public class MaximumProductPair {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 6, 7, 0};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max1) {
                max2 = max1;
                max1 = num;
            }

            else if (num > max2) {
                max2 = num;
            }
        }

        System.out.println("Maximum Product: "
                + (max1 * max2));
    }
}