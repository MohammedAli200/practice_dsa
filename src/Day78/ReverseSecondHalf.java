package Day78;

import java.util.Scanner;

public class ReverseSecondHalf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int mid = str.length() / 2;

        System.out.print(str.substring(0, mid));

        for (int i = str.length() - 1; i >= mid; i--) {
            System.out.print(str.charAt(i));
        }
    }
}