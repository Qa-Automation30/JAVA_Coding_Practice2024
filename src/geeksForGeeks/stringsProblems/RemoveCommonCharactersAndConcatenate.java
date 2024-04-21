package geeksForGeeks.stringsProblems;

import java.util.HashSet;
import java.util.Set;
// still need to solve
public class RemoveCommonCharactersAndConcatenate {
    /**
     * Given two strings s1 and s2. Modify both the strings such that all the common characters
     * of s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
     * Note: If all characters are removed print -1.
     *
     *   Input:
     * s1 = aacdb
     * s2 = gafd
     * Output: cbgf
     * Explanation: The common characters of s1
     * and s2 are: a, d. The uncommon characters
     * of s1 and s2 are c, b, g and f. Thus the
     * modified string with uncommon characters
     * concatenated is cbgf.
     *
     *  Input:
     * s1 = abcs
     * s2 = cxzca
     * Output: bsxz
     * Explanation: The common characters of s1
     * and s2 are: a,c. The uncommon characters
     * of s1 and s2 are b,s,x and z. Thus the
     * modified string with uncommon characters
     * concatenated is bsxz.
     *
     */
    public static void main(String[] args) {
        String s1 ="aacdb";
        String s2 = "gafd";
        removeCommonCharactersAndConcatenate(s1,s2);
    }

    static void removeCommonCharactersAndConcatenate(String s1, String s2){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i=0;i<s1.length();i++){
            set1.add(s1.charAt(i));
        }
        for (int i=0;i<s2.length();i++){
            set2.add(s2.charAt(i));
        }
        System.out.println(set1);
        System.out.println(set2);

    }
}
