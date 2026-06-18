package Day45;

import java.util.Scanner;

public class NearestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int count =0;
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        int min=Integer.MAX_VALUE;
        int iValue=0,j_value=0;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]<=target){
                    int sum=arr[i]+arr[j];
                    int minValue=target-sum;
                    if(min>minValue) {
                        min = minValue;
                        iValue = arr[i];
                        j_value = arr[j];
                    }
                }
            }
        }
        System.out.println("indexes: "+iValue+" "+j_value);
    }
}
