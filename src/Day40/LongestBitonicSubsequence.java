package Day40;

public class LongestBitonicSubsequence {

    public static void main(String[] args) {

        int[] arr = {1, 11, 2, 10, 4, 5, 2, 1};

        int n = arr.length;

        int[] lis = new int[n];
        int[] lds = new int[n];

        for (int i = 0; i < n; i++) {

            lis[i] = 1;

            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[i]) {

                    lis[i] = Math.max(
                            lis[i],
                            lis[j] + 1
                    );
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {

            lds[i] = 1;

            for (int j = n - 1; j > i; j--) {

                if (arr[j] < arr[i]) {

                    lds[i] = Math.max(
                            lds[i],
                            lds[j] + 1
                    );
                }
            }
        }

        int max = 0;

        for (int i = 0; i < n; i++) {

            max = Math.max(
                    max,
                    lis[i] + lds[i] - 1
            );
        }

        System.out.println(max);
    }
}