package Day8;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1};

        int maxCount = 0;
        int current = 0;

        for (int num : arr) {

            if (num == 1) {
                current++;
                maxCount = Math.max(maxCount, current);
            } else {
                current = 0;
            }
        }

        System.out.println("Maximum Ones: " + maxCount);
    }
}