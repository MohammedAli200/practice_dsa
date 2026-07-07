package Day64;

import java.util.Scanner;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        char[] str = sc.nextLine().toCharArray();

        int left = 0;
        int right = str.length - 1;

        while (left < right) {

            if (!Character.isLetter(str[left])) {
                left++;
            } else if (!Character.isLetter(str[right])) {
                right--;
            } else {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(str));
    }
}