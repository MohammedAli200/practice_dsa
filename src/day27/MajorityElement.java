package day27;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        int candidate = 0;
        int count = 0;

        for (int num : arr) {

            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        count = 0;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    }
}