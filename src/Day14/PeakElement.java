package Day14;

public class PeakElement {
    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peak = -1;

        for (int i = 0; i < arr.length; i++) {

            boolean left =
                    (i == 0)
                            || (arr[i] >= arr[i - 1]);

            boolean right =
                    (i == arr.length - 1)
                            || (arr[i] >= arr[i + 1]);

            if (left && right) {

                peak = arr[i];
                break;
            }
        }

        System.out.println("Peak Element: "
                + peak);
    }
}