package Day87;

import java.util.Scanner;

public class ExcelColumnNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String column = sc.nextLine().toUpperCase();

        int result = 0;

        for (int i = 0; i < column.length(); i++) {

            result = result * 26 +
                    (column.charAt(i) - 'A' + 1);
        }

        System.out.println(result);
    }
}