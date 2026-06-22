package Day49;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                sec=max;
                max=arr[i];
            }
            else if (sec<arr[i]&&arr[i]<max)
                sec=arr[i];
        }
        System.out.println("the second largest element is "+sec);
    }
}
