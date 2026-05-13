package Day10;

public class DuplicateElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 3, 6, 6};

        int[] freq = new int[100];

        for (int num : arr) {
            freq[num]++;
        }

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > 1) {
                System.out.println(i);
            }
        }
    }
}