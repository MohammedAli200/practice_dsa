package Day34;

public class JumpGame {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 1, 4};

        int reachable = 0;

        for (int i = 0;
             i < nums.length;
             i++) {

            if (i > reachable) {

                System.out.println(false);
                return;
            }

            reachable =
                    Math.max(
                            reachable,
                            i + nums[i]
                    );
        }

        System.out.println(true);
    }
}