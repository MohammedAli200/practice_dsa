package Day70;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int palindrome=0;
        while(num>0){
            int rem=num%10;
            palindrome=rem+palindrome*10;
            System.out.println(palindrome);
            num/=10;
        }
        System.out.println(palindrome);
    }
}
