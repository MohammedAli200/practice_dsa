package Day1;
import java.util.Scanner;
public class ReverseaNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int a= sc.nextInt();
        int sum=0;
        while(a!=0){
            int rem=a%10;
            sum=sum*10+rem;
            a/=10;
        }
        System.out.println(sum);
    }
}
