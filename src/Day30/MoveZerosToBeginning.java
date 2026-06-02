package Day30;

import java.util.*;

public class MoveZerosToBeginning {

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,4};

        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }

        while (index >= 0) {
            arr[index--] = 0;
        }

        System.out.println(
                Arrays.toString(arr)
        );
    }
}