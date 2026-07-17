package Day74;

import java.util.Scanner;

public class LargestNumberInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int max = Integer.MIN_VALUE;
        String num = "";

        for (int i = 0; i <= str.length(); i++) {

            if (i < str.length() && Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
            } else {
                if (!num.equals("")) {
                    int value = Integer.parseInt(num);

                    if (value > max)
                        max = value;

                    num = "";
                }
            }
        }

        if (max == Integer.MIN_VALUE)
            System.out.println("No Number Found");
        else
            System.out.println("Largest Number = " + max);
    }
}