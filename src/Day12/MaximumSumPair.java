package Day12;

public class MaximumSumPair {
    public static void main(String[] args) {

        int[] arr = {12, 34, 10, 6, 40};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {

                second = first;
                first = num;
            }

            else if (num > second) {

                second = num;
            }
        }

        System.out.println("Maximum Sum Pair: "
                + (first + second));
    }
}