package Day2;

import java.util.Scanner;

public class MaxElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicsOfArray bs = new BasicsOfArray();
        System.out.println("enter the length of the array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        bs.inputArray(arr);
        bs.printArray(arr);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("maximum value is: "+max);
    }
}
