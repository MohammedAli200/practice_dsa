package Day45;

import java.util.Scanner;

public class ClassicTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("indexes are "+i+","+j);
                }
            }
        }
    }
}
