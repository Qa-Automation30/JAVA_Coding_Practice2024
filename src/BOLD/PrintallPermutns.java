package BOLD;

import java.util.ArrayList;

public class PrintallPermutns {

    public static void main(String[] args) {
        String str = "abc";
        generatePermutations("", str);
    }

    public static void generatePermutations(String prefix, String str) {
        int strLength = str.length();
        if (strLength == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < strLength; i++) {
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, strLength));
            }
        }
    }
}
