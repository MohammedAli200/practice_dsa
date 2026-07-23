package Day80;

import java.util.Scanner;

public class PrimeLengthWords {

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split("\\s+");

        int count = 0;

        for (String word : words) {

            if (isPrime(word.length()))
                count++;
        }

        System.out.println("Prime Length Words = " + count);
    }
}