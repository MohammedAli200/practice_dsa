package Day4;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
