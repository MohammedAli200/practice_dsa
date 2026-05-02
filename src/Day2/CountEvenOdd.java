package Day2;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicsOfArray bs = new BasicsOfArray();
        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
        int even=0 , odd=0;
        int[] arr = new int[n];
        bs.inputArray(arr);
        bs.printArray(arr);
        for(int num : arr){
            if(num%2==0)
                even+=num;
            else
                odd+=num;
        }
        System.out.println("sum of even numbers are "+even+"\n"+"sum of odd numbers are "+odd);
    }
}
