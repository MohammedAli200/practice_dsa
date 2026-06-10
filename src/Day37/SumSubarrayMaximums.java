package Day37;

public class SumSubarrayMaximums {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            int max = arr[i];

            for (int j = i; j < arr.length; j++) {

                max = Math.max(max, arr[j]);

                sum += max;
            }
        }

        System.out.println(sum);
    }
}