package Day88;

import java.util.Scanner;

public class ExcelColumnName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder result = new StringBuilder();

        while (n > 0) {

            n--;

            result.append((char) ('A' + (n % 26)));

            n /= 26;
        }

        System.out.println(result.reverse());
    }
}