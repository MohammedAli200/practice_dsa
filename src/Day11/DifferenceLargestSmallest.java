package Day11;

public class DifferenceLargestSmallest {
    public static void main(String[] args) {

        int[] arr = {10, 3, 5, 6, 2};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println("Difference: "
                + (max - min));
    }
}