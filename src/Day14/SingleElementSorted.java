package Day14;

public class SingleElementSorted {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        System.out.println(
                "Single Element: "
                        + result
        );
    }
}