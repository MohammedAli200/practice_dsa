package Day33;

import java.util.*;

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leaders =
                new ArrayList<>();

        int maxFromRight =
                arr[arr.length - 1];

        leaders.add(maxFromRight);

        for (int i = arr.length - 2;
             i >= 0;
             i--) {

            if (arr[i] > maxFromRight) {

                maxFromRight = arr[i];
                leaders.add(arr[i]);
            }
        }

        Collections.reverse(leaders);

        System.out.println(leaders);
    }
}