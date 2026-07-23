package Day80;

import java.util.Scanner;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && !Character.isLetter(arr[left]))
                left++;

            while (left < right && !Character.isLetter(arr[right]))
                right--;

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println(new String(arr));
    }
}