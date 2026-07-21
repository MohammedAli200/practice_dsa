package Day78;

import java.util.Scanner;

public class ReverseFirstHalf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int mid = str.length() / 2;

        for (int i = mid - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.print(str.substring(mid));
    }
}