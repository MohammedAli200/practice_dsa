package Day14;

public class RotationCount {
    public static void main(String[] args) {

        int[] arr = {15, 18, 2, 3, 6, 12};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] <= arr[right]) {

                System.out.println(
                        "Rotations: "
                                + left
                );

                return;
            }

            int mid =
                    left + (right - left) / 2;

            int next =
                    (mid + 1) % arr.length;

            int prev =
                    (mid + arr.length - 1)
                            % arr.length;

            if (arr[mid] <= arr[next]
                    && arr[mid] <= arr[prev]) {

                System.out.println(
                        "Rotations: "
                                + mid
                );

                return;
            }

            if (arr[mid] <= arr[right]) {

                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }
    }
}