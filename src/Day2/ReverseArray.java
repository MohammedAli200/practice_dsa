package Day2;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicsOfArray bs = new BasicsOfArray();
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        bs.inputArray(arr);
        bs.printArray(arr);
        for(int i= arr.length-1;i>=0;i--)
            System.out.print(arr[i]+" ");

    }
}
