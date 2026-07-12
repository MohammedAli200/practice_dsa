package Day69;

import java.util.Scanner;

public class RepeatedSubstringPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String temp = str + str;

        if (temp.substring(1, temp.length() - 1).contains(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}