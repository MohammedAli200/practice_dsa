package Day10;

public class AlternatingEvenOdd {
    public static void main(String[] args) {

        int[] arr = {5, 10, 20, 6, 3, 8};

        int maxLength = 1;
        int current = 1;

        for (int i = 1; i < arr.length; i++) {

            if ((arr[i] % 2 == 0
                    && arr[i - 1] % 2 != 0)
                    ||
                    (arr[i] % 2 != 0
                            && arr[i - 1] % 2 == 0)) {

                current++;
                maxLength = Math.max(maxLength,
                        current);

            } else {
                current = 1;
            }
        }

        System.out.println("Maximum Length: "
                + maxLength);
    }
}
