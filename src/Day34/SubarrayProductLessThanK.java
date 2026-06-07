package Day34;

public class SubarrayProductLessThanK {

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 6};

        int k = 100;

        int product = 1;
        int left = 0;
        int count = 0;

        for (int right = 0;
             right < arr.length;
             right++) {

            product *= arr[right];

            while (product >= k) {

                product /= arr[left++];
            }

            count +=
                    right - left + 1;
        }

        System.out.println(count);
    }
}