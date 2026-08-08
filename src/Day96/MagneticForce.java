package Day96;

import java.util.Arrays;
import java.util.Scanner;

public class MagneticForce {

    static boolean canPlace(int[] position, int balls, int distance) {

        int count = 1;
        int lastPosition = position[0];

        for (int i = 1; i < position.length; i++) {

            if (position[i] - lastPosition >= distance) {

                count++;
                lastPosition = position[i];

                if (count >= balls)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] position = new int[n];

        for (int i = 0; i < n; i++)
            position[i] = sc.nextInt();

        int balls = sc.nextInt();

        Arrays.sort(position);

        int low = 1;
        int high = position[n - 1] - position[0];

        int answer = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPlace(position, balls, mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(answer);
    }
}