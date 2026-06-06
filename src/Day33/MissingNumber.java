package Day33;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        int n = arr.length;

        int expected =
                n * (n + 1) / 2;

        int actual = 0;

        for (int num : arr) {
            actual += num;
        }

        System.out.println(
                expected - actual
        );
    }
}