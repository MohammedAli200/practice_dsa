package Day61;

import java.util.Scanner;

public class ZigzagConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int rows = sc.nextInt();

        if (rows == 1) {
            System.out.println(str);
            return;
        }

        StringBuilder[] sb =
                new StringBuilder[rows];

        for (int i = 0; i < rows; i++) {
            sb[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;

        for (char ch : str.toCharArray()) {
            sb[row].append(ch);

            if (row == 0) {
                down = true;
            } else if (row == rows - 1) {
                down = false;
            }

            row += down ? 1 : -1;
        }

        StringBuilder result =
                new StringBuilder();

        for (StringBuilder s : sb) {
            result.append(s);
        }

        System.out.println(result);
    }
}