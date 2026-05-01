package Day1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number to check it's perfect number or not");
        int a = sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0)
                sum+=i;
        }
        if(sum==a)
            System.out.println("perfect number");
        else
            System.out.println("not a prefect number");
    }
}
