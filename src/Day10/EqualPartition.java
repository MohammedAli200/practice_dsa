package Day10;

public class EqualPartition {
    public static void main(String[] args) {

        int[] arr = {1, 5, 11, 5};

        int total = 0;

        for (int num : arr) {
            total += num;
        }

        if (total % 2 != 0) {
            System.out.println("Cannot Partition");
            return;
        }

        int target = total / 2;

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for (int num : arr) {

            for (int j = target;
                 j >= num;
                 j--) {

                dp[j] = dp[j]
                        || dp[j - num];
            }
        }

        System.out.println(dp[target]
                ? "Can Partition"
                : "Cannot Partition");
    }
}