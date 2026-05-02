package Day2;

import java.util.Scanner;

public class TotalCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicsOfArray bs = new BasicsOfArray();
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        bs.inputArray(arr);
        bs.printArray(arr);
        int sum=0;
        for(int num : arr)
            sum+=num;
        System.out.println("the total count of digits in array is :"+sum);
    }
}
