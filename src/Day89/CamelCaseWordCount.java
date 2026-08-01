package Day89;

import java.util.Scanner;

public class CamelCaseWordCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i)))
                count++;
        }

        System.out.println("Words = " + count);
    }
}