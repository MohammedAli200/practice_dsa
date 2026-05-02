package Day2;

import java.util.Scanner;

public class BasicsOfArray {
    static int[] inputArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    static void printArray(int[] arr){
        for (int a : arr)
            System.out.print(a+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter "+n+" elements in array");
        inputArray(arr);
        printArray(arr);
    }
}
