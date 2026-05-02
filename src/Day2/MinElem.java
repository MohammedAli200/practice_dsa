package Day2;

import java.util.Scanner;

public class MinElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicsOfArray bs = new BasicsOfArray();
        System.out.println("enter tle size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        bs.inputArray(arr);
        bs.printArray(arr);
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (min>arr[i])
                min=arr[i];
        }
        System.out.println("minimum element in array is "+min);
    }
}
