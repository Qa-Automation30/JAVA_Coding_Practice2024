package geeksForGeeks.stringsProblems;

import java.util.HashMap;
import java.util.Map;
// Need to do, not able to solve alone
public class CheckForSubsequence {
    /**
     *   Given two strings A and B, find if A is a subsequence of B.
     *    Input:
     * A = AXY
     * B = YADXCP
     * Output: 0
     * Explanation: A is not a subsequence of B
     * as 'Y' appears before 'A'.
     *
     *  Input:
     * A = gksrek
     * B = geeksforgeeks
     * Output: 1
     * Explanation: A is a subsequence of B.
     *
     * @param args
     */
    public static void main(String[] args) {
        String str1  ="AXY";
        String str2  ="YADXCP";
    }
    static void checkForSubsequence(String s1, String s2){
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

    }
}
