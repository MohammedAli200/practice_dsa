package Day47;

import java.util.Scanner;

public class Kadanes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=0 , case_sum=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            case_sum += arr[i];
            if (max < case_sum) max = case_sum;
            if (case_sum < 0) {
                case_sum = 0;
            }
        }
        System.out.println("max="+max);
    }
}
