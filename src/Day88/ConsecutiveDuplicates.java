package Day88;

import java.util.Scanner;

public class ConsecutiveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1))
                count++;
        }

        System.out.println("Consecutive Duplicate Pairs = " + count);
    }
}