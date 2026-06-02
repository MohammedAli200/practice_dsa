package Day30;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {

        int[] arr = {1,1,0,1,1,1};

        int max = 0;
        int count = 0;

        for (int num : arr) {

            if (num == 1) {

                count++;
                max = Math.max(max, count);

            } else {

                count = 0;
            }
        }

        System.out.println(max);
    }
}