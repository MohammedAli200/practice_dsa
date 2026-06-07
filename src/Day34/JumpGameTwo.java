package Day34;

public class JumpGameTwo {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 1, 4};

        int jumps = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0;
             i < nums.length - 1;
             i++) {

            farthest =
                    Math.max(
                            farthest,
                            i + nums[i]
                    );

            if (i == end) {

                jumps++;
                end = farthest;
            }
        }

        System.out.println(jumps);
    }
}
