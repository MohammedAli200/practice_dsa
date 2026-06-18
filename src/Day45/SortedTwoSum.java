package Day45;

import java.util.Scanner;

public class SortedTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        int count =0;
        for (int i=1;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        for(int i=1;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("indexes are :"+i+" "+j);
                }
            }
        }
    }
}
