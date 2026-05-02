package Day1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check whether the number is armstrong number or not ");
        int a = sc.nextInt();
        int count =0 , temp =a , sum=0 ,temp1 =a;
        while(a!=0){
            count++;
            a/=10;
        }
//        System.out.println(count);

        while(temp!=0){
            int digit = temp%10;
            int pow=1;
            for (int i = 0; i < count; i++) {
                pow*=digit;
            }
            sum+=pow;
            temp/=10;
        }
//        System.out.println(sum);
        if (temp1==sum)
            System.out.println("armstrong");
        else
            System.out.println("not an armstrong");
    }
}
