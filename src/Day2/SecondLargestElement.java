package Day2;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicsOfArray bs = new BasicsOfArray();
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        bs.inputArray(arr);
        bs.printArray(arr);
        int first = arr[0];
        int second = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first){
                second=first;
                first=arr[i];
            } else if (second<arr[i]&&arr[i]!=first) {
                second=arr[i];
            }
        }
        System.out.println("second largest elem is "+second);
    }
}
