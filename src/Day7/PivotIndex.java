package Day7;

public class PivotIndex {
    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};

        int total = 0;

        for (int num : arr) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (leftSum == total - leftSum - arr[i]) {
                System.out.println("Pivot Index: " + i);
                return;
            }

            leftSum += arr[i];
        }

        System.out.println("No Pivot Index");
    }
}