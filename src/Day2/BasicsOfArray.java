package Day2;

import java.util.Scanner;

public class BasicsOfArray {
    static int[] inputArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter "+arr.length+" elements in array");
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
        inputArray(arr);
        printArray(arr);
    }
}
