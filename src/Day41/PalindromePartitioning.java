package Day41;

public class PalindromePartitioning {

    static boolean isPalindrome(
            String str,
            int start,
            int end) {

        while (start < end) {

            if (str.charAt(start)
                    != str.charAt(end)) {

                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "aab";

        int n = str.length();

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {

            if (isPalindrome(str, 0, i)) {

                dp[i] = 0;

            } else {

                dp[i] = Integer.MAX_VALUE;

                for (int j = 0; j < i; j++) {

                    if (isPalindrome(
                            str,
                            j + 1,
                            i)) {

                        dp[i] = Math.min(
                                dp[i],
                                dp[j] + 1
                        );
                    }
                }
            }
        }

        System.out.println(
                "Minimum Cuts = "
                        + dp[n - 1]
        );
    }
}