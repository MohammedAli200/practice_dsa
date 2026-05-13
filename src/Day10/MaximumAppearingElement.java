package Day10;

public class MaximumAppearingElement {
    public static void main(String[] args) {

        int[] left = {1, 2, 3};
        int[] right = {3, 5, 7};

        int[] freq = new int[100];

        for (int i = 0; i < left.length; i++) {

            for (int j = left[i]; j <= right[i]; j++) {
                freq[j]++;
            }
        }

        int max = freq[0];
        int result = 0;

        for (int i = 1; i < freq.length; i++) {

            if (freq[i] > max) {
                max = freq[i];
                result = i;
            }
        }

        System.out.println("Maximum Appearing: " + result);
    }
}
