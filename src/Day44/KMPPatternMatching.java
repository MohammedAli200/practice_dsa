package Day44;

public class KMPPatternMatching {

    static void computeLPS(
            String pattern,
            int[] lps) {

        int len = 0;
        int i = 1;

        while (i < pattern.length()) {

            if (pattern.charAt(i)
                    == pattern.charAt(len)) {

                len++;
                lps[i] = len;
                i++;

            } else {

                if (len != 0) {

                    len = lps[len - 1];

                } else {

                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {

        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        int[] lps =
                new int[pattern.length()];

        computeLPS(pattern, lps);

        int i = 0;
        int j = 0;

        while (i < text.length()) {

            if (pattern.charAt(j)
                    == text.charAt(i)) {

                i++;
                j++;
            }

            if (j == pattern.length()) {

                System.out.println(
                        "Pattern found at index "
                                + (i - j)
                );

                j = lps[j - 1];

            } else if (
                    i < text.length()
                            &&
                            pattern.charAt(j)
                                    != text.charAt(i)
            ) {

                if (j != 0) {

                    j = lps[j - 1];

                } else {

                    i++;
                }
            }
        }
    }
}