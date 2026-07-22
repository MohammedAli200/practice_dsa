package Day79;

import java.util.Scanner;

public class CyclicRotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("No");
        } else if ((s1 + s1).contains(s2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}