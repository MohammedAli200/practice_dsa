package Day73;

import java.util.Scanner;

public class FirstLastOccurrence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        System.out.println("First Occurrence: " + str.indexOf(ch));
        System.out.println("Last Occurrence: " + str.lastIndexOf(ch));
    }
}