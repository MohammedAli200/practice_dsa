package Day49;

import java.util.Scanner;

public class Moveszerotoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count =0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
