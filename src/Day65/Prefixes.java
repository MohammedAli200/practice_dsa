package Day65;

import java.util.Scanner;

public class Prefixes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
    }
}