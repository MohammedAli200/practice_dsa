package Day74;

import java.util.Scanner;

public class ReplaceSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ')
                result += "%20";
            else
                result += str.charAt(i);
        }

        System.out.println(result);
    }
}