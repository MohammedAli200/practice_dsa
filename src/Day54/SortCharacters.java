package Day54;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        System.out.println(new String(arr));
    }
}