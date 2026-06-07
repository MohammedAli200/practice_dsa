package Day34;

public class LongestMountain {

    public static void main(String[] args) {

        int[] arr = {
                2, 1, 4, 7,
                3, 2, 5
        };

        int longest = 0;
        int i = 1;

        while (i < arr.length - 1) {

            if (arr[i] >
                    arr[i - 1]
                    &&
                    arr[i] >
                            arr[i + 1]) {

                int left = i;
                int right = i;

                while (
                        left > 0
                                &&
                                arr[left] >
                                        arr[left - 1]
                ) {

                    left--;
                }

                while (
                        right < arr.length - 1
                                &&
                                arr[right] >
                                        arr[right + 1]
                ) {

                    right++;
                }

                longest =
                        Math.max(
                                longest,
                                right - left + 1
                        );

                i = right;

            } else {

                i++;
            }
        }

        System.out.println(longest);
    }
}