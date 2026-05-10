package Day7;

public class SingleElement {
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        System.out.println("Single Element: " + result);
    }
}