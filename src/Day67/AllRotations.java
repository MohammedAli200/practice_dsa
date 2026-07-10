package Day67;

import java.util.Scanner;

public class AllRotations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String temp = str + str;

        for (int i = 0; i < str.length(); i++) {
            System.out.println(temp.substring(i, i + str.length()));
        }
    }
}