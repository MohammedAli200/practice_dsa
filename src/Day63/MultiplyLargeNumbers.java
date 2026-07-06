package Day63;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyLargeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        BigInteger num1 = new BigInteger(sc.nextLine());

        System.out.print("Enter Second Number: ");
        BigInteger num2 = new BigInteger(sc.nextLine());

        System.out.println("Product = " + num1.multiply(num2));
    }
}