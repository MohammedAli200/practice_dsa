package Day24;

import java.util.*;

public class SleepSort {

    public static void main(String[] args) {

        int[] arr = {
                4, 2, 7, 1
        };

        for (int num : arr) {

            new Thread(() -> {

                try {

                    Thread.sleep(
                            num * 1000
                    );

                    System.out.print(
                            num + " "
                    );

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }).start();
        }
    }
}