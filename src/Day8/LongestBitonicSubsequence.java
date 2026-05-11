package Day8;

public class LongestBitonicSubsequence {
    public static void main(String[] args) {

        int[] arr = {1, 11, 2, 10, 4, 5, 2, 1};

        int n = arr.length;

        int[] lis = new int[n];
        int[] lds = new int[n];

        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            lds[i] = 1;
        }

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]
                        && lis[i] < lis[j] + 1) {

                    lis[i] = lis[j] + 1;
                }
            }
        }

        for (int i = n - 2; i >= 0; i--) {

            for (int j = n - 1; j > i; j--) {

                if (arr[i] > arr[j]
                        && lds[i] < lds[j] + 1) {

                    lds[i] = lds[j] + 1;
                }
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max,
                    lis[i] + lds[i] - 1);
        }

        System.out.println("Longest Bitonic Length: " + max);
    }
}