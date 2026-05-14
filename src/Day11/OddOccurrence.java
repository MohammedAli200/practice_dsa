package Day11;

public class OddOccurrence {
    public static void main(String[] args) {

        int[] arr = {4, 3, 4, 4, 4, 5, 5};

        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        System.out.println("Odd Occurring Element: "
                + result);
    }
}