package Day31;

public class MissingRanges {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 10};

        int start = 1;
        int end = 12;

        int prev = start - 1;

        for (int i = 0; i <= arr.length; i++) {

            int curr =
                    (i == arr.length)
                            ? end + 1
                            : arr[i];

            if (curr - prev >= 2) {

                System.out.println(
                        (prev + 1)
                                + " -> "
                                + (curr - 1)
                );
            }

            prev = curr;
        }
    }
}