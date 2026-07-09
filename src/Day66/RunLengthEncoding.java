package Day66;

import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {

            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1);
                result += count;
                count = 1;
            }
        }

        System.out.println("Compressed String: " + result);
    }
}