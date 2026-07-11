package Day68;

import java.util.Scanner;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean[] visited = new boolean[256];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (visited[ch]) {
                System.out.println("First Repeated Character: " + ch);
                return;
            }

            visited[ch] = true;
        }

        System.out.println("No Repeated Character");
    }
}