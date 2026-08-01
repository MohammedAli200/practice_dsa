package Day89;

import java.util.HashSet;
import java.util.Scanner;

public class JavaKeywordCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        HashSet<String> keywords = new HashSet<>();

        String[] list = {
                "abstract","assert","boolean","break","byte","case","catch",
                "char","class","const","continue","default","do","double",
                "else","enum","extends","final","finally","float","for",
                "goto","if","implements","import","instanceof","int",
                "interface","long","native","new","package","private",
                "protected","public","return","short","static","strictfp",
                "super","switch","synchronized","this","throw","throws",
                "transient","try","void","volatile","while"
        };

        for (String k : list)
            keywords.add(k);

        if (keywords.contains(word))
            System.out.println("Java Keyword");
        else
            System.out.println("Not a Java Keyword");
    }
}