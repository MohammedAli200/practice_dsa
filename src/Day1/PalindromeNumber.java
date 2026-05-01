package Day1;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check is it a palindrome or not: ");
        int a=sc.nextInt();
        int temp=a;
        int rev=0;
        while(a!=0){
            int rem=a%10;
            rev=rev*10+rem;
            a/=10;
        }
        if(rev==temp)
            System.out.println("Palindrome");
        else
            System.out.println("not palindrome");
    }
}
