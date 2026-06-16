package Day43;

import java.util.*;

public class TextJustification {

    public static void main(String[] args) {

        String[] words = {
                "This", "is", "a",
                "text", "justification",
                "example"
        };

        int maxWidth = 16;

        List<String> result =
                new ArrayList<>();

        int i = 0;

        while (i < words.length) {

            int length =
                    words[i].length();

            int j = i + 1;

            while (j < words.length
                    &&
                    length + 1
                            + words[j].length()
                            <= maxWidth) {

                length +=
                        1 + words[j].length();

                j++;
            }

            StringBuilder line =
                    new StringBuilder();

            for (int k = i;
                 k < j;
                 k++) {

                line.append(words[k]);

                if (k != j - 1) {
                    line.append(" ");
                }
            }

            result.add(line.toString());

            i = j;
        }

        for (String line : result) {

            System.out.println(line);
        }
    }
}