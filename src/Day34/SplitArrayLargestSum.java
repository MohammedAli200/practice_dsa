package Day34;

public class SplitArrayLargestSum {

    static boolean canSplit(
            int[] nums,
            int maxSum,
            int parts) {

        int count = 1;
        int current = 0;

        for (int num : nums) {

            if (current + num >
                    maxSum) {

                count++;
                current = num;

            } else {

                current += num;
            }
        }

        return count <= parts;
    }

    public static void main(String[] args) {

        int[] nums = {7, 2, 5, 10, 8};

        int m = 2;

        int left = 10;
        int right = 32;

        while (left < right) {

            int mid =
                    left
                            + (right - left) / 2;

            if (canSplit(
                    nums,
                    mid,
                    m)) {

                right = mid;

            } else {

                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}