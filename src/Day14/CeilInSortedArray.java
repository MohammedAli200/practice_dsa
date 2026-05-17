package Day14;

public class CeilInSortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 10, 12, 14};
        int target = 7;

        int ceil = -1;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid =
                    left + (right - left) / 2;

            if (arr[mid] == target) {

                ceil = arr[mid];
                break;
            }

            if (arr[mid] > target) {

                ceil = arr[mid];
                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }

        System.out.println("Ceil: "
                + ceil);
    }
}