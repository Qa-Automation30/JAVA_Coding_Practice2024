package geeksForGeeks.stringsProblems;

import java.util.*;

public class Uncommoncharacters {
    // Need to work on it
    public static void main(String[] args) {
        /**
         * Given two strings A and B consisting of lowercase english characters.
         * Find the characters that are not common in the two strings.
         *
         * Note :- Return the string in sorted order.
         *
         * Input:
         * A = geeksforgeeks
         * B = geeksquiz
         * Output: fioqruz
         * Explanation:
         * The characters 'f', 'i', 'o', 'q', 'r', 'u','z'
         * are either present in A or B, but not in both.
         *
         *
         * Input:
         * A = characters
         * B = alphabets
         * Output: bclpr
         * Explanation: The characters 'b','c','l','p','r'
         * are either present in A or B, but not in both.
         *
         *
         */

        String str1 = "characters";
        String str2 = "alphabets";

        System.out.print(unCommonChars(str1, str2));
    }

    static String unCommonChars(String str1, String str2) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (char c : str1.toCharArray()) {
            list1.add(c);
        }
        for (char c : str2.toCharArray()) {
            list2.add(c);
        }
        System.out.println();
        List<Character> uncommonChars = new ArrayList<>();
        uncommonChars.addAll(list1);
        uncommonChars.addAll(list2);

        System.out.println(uncommonChars);


        return "PP";
    }
}