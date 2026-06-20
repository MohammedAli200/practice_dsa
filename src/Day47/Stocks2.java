package Day47;

import java.util.Scanner;

public class Stocks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("finding max profit");
        int profit=0;
        for (int i = 0; i < arr.length; i++) {
            int max=0;
            for (int j = i; j <arr.length; j++) {
                int diff=arr[j]-arr[i];
                if(diff>max&&arr[j]>arr[j+1]){
                    max=diff;
                    System.out.println("buy is "+arr[i]+"sell is "+arr[j]);
                    i++;
                    j++;
                }
            }
            profit+=max;
        }
        System.out.println("the maximum profit is "+profit);
    }
}
