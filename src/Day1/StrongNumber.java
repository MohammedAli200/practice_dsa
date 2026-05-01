package Day1;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check the number is strong or not");
        int a = sc.nextInt();
        int sum=0;
        int temp=a;
        while(a!=0){
            int rem = a%10;
            int fact=1;
            for (int i=1;i<=rem;i++) {
                fact *= i;
            }
            sum+=fact;
            a/=10;
        }
        if(sum==temp){
            System.out.println("number is strong number");
        }
        else
            System.out.println("not a strong number");
    }
}
