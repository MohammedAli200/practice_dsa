package Day47;

import java.util.Scanner;

public class Stocks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("finding the best time to buy and sell stocks");
        int max=0;
        int buy =0 , sell =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                int diff = arr[j]-arr[i];
                if(diff>max){
                    buy=arr[i];
                    sell=arr[j];
                    max=diff;
                }
            }
        }
        System.out.println("the best value of buying the stock is "+buy+"\nthe best time to sell is "+sell+"\nthen profit is "+max);
    }
}
