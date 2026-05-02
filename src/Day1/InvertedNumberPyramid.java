package Day1;

import java.util.Scanner;

public class InvertedNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to get inverted pyramid of numbers");
        int a =sc.nextInt();
        for (int i = a; i > 0; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}




//12345
//1234
//123
//12
//1