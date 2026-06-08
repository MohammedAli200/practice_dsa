package Day35;

public class MaximumPointsFromCards {

    public static void main(String[] args) {

        int[] cards = {
                1,2,3,4,5,6,1
        };

        int k = 3;

        int current = 0;

        for (int i = 0; i < k; i++) {

            current += cards[i];
        }

        int max = current;

        int right =
                cards.length - 1;

        for (int left = k - 1;
             left >= 0;
             left--) {

            current -= cards[left];
            current += cards[right--];

            max =
                    Math.max(
                            max,
                            current
                    );
        }

        System.out.println(max);
    }
}