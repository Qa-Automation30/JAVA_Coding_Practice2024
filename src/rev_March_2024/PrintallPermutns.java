package rev_March_2024;

import java.util.ArrayList;

public class PrintallPermutns {

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> permutations = generatePermutations(str);

        for (String perm : permutations) {
            System.out.println(perm);
        }
    }

    public static ArrayList<String> generatePermutations(String str) {
        ArrayList<String> result = new ArrayList<>();
        generatePermutationsHelper("", str, result);
        return result;
    }

    private static void generatePermutationsHelper(String prefix, String remaining, ArrayList<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutationsHelper(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i+1, n),
                        result);
            }
        }
    }
}
