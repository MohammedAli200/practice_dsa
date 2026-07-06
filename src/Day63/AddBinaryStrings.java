package Day63;

import java.util.Scanner;

public class AddBinaryStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Binary: ");
        String a = sc.nextLine();

        System.out.print("Enter Second Binary: ");
        String b = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if (i >= 0)
                sum += a.charAt(i--) - '0';

            if (j >= 0)
                sum += b.charAt(j--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }

        System.out.println(result.reverse());
    }
}