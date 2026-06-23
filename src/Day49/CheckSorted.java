package Day49;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i]<arr[i+1]) System.out.println("array is not sorted");
        }
    }
}
