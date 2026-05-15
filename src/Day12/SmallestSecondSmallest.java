package Day12;

public class SmallestSecondSmallest {
    public static void main(String[] args) {

        int[] arr = {12, 13, 1, 10, 34, 1};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < smallest) {

                secondSmallest = smallest;
                smallest = num;
            }

            else if (num < secondSmallest
                    && num != smallest) {

                secondSmallest = num;
            }
        }

        System.out.println("Smallest: "
                + smallest);

        System.out.println("Second Smallest: "
                + secondSmallest);
    }
}