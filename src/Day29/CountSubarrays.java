package Day29;

public class CountSubarrays {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int n = arr.length;

        int total =
                n * (n + 1) / 2;

        System.out.println(
                "Total Subarrays = "
                        + total
        );
    }
}