package Day24;

import java.util.*;

public class TimSort {
    public static void main(String[] args) {

        int[] arr = {
                5, 21, 7, 23,
                19, 10, 3
        };

        Arrays.sort(arr);

        System.out.println(
                Arrays.toString(arr)
        );
    }
}