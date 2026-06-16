package Day43;

public class RabinKarp {

    public static void main(String[] args) {

        String text = "ABCCDDAEFG";
        String pattern = "CDD";

        int n = text.length();
        int m = pattern.length();

        for (int i = 0;
             i <= n - m;
             i++) {

            String sub =
                    text.substring(i, i + m);

            if (sub.equals(pattern)) {

                System.out.println(
                        "Pattern found at index "
                                + i
                );
            }
        }
    }
}