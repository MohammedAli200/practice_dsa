package Day2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicsOfArray bs = new BasicsOfArray();
        System.out.println("enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        bs.inputArray(arr);
        bs.printArray(arr);
        System.out.println("enter a elem to search");
        int num = sc.nextInt();
        int count =0;
        for (int i = 0; i <arr.length ;i++) {
            if(num==arr[i]) {
                System.out.println("elem is fount at position " + i);
                count++;
                break;
            }
            else continue;
        }
        if(count==0) System.out.println("elem is not found");
    }
}
