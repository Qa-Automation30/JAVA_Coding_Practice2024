package anagram;

import java.util.Arrays;

public class Anagram_1 {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 ="Silenth";

        char[] c1 = str1.toLowerCase().toCharArray();
        char[] c2 = str2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String test = Arrays.equals(c1,c2) ? "fine" : "Not Fine";
        System.out.println(test);

    }
}
