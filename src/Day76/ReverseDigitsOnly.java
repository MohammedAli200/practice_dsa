package Day76;

import java.util.Scanner;

public class ReverseDigitsOnly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] str = sc.nextLine().toCharArray();

        int left = 0;
        int right = str.length - 1;

        while (left < right) {

            while (left < right && !Character.isDigit(str[left]))
                left++;

            while (left < right && !Character.isDigit(str[right]))
                right--;

            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(str));
    }
}