package Day24;

import java.util.*;

public class CycleSort {
    public static void main(String[] args) {

        int[] arr = {
                20, 40, 50, 10, 30
        };

        int n = arr.length;

        for (int cycleStart = 0;
             cycleStart < n - 1;
             cycleStart++) {

            int item = arr[cycleStart];

            int pos = cycleStart;

            for (int i = cycleStart + 1;
                 i < n;
                 i++) {

                if (arr[i] < item) {
                    pos++;
                }
            }

            if (pos == cycleStart) {
                continue;
            }

            while (item == arr[pos]) {
                pos++;
            }

            int temp = item;
            item = arr[pos];
            arr[pos] = temp;

            while (pos != cycleStart) {

                pos = cycleStart;

                for (int i =
                     cycleStart + 1;
                     i < n;
                     i++) {

                    if (arr[i] < item) {
                        pos++;
                    }
                }

                while (item == arr[pos]) {
                    pos++;
                }

                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}