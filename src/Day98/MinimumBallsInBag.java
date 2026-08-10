package Day98;

import java.util.Scanner;

public class MinimumBallsInBag {

    static boolean possible(int[] nums, int operations, int limit) {

        int required = 0;

        for (int num : nums) {
            required += (num - 1) / limit;

            if (required > operations)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        int high = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            high = Math.max(high, nums[i]);
        }

        int operations = sc.nextInt();

        int low = 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (possible(nums, operations, mid))
                high = mid;
            else
                low = mid + 1;
        }

        System.out.println("Minimum Maximum Balls = " + low);
    }
}