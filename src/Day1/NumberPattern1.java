package Day1;

import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to print its pattern");
        int a = sc.nextInt();
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}



//1
//22
//333
//4444
//55555