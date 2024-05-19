package geeksForGeeks.stringsProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
// Solved by me only
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
        String s1 ="abcs";
        String s2 = "cxzca";
        removeCommonCharactersAndConcatenate(s1,s2);
    }

    static void removeCommonCharactersAndConcatenate(String s1, String s2){
        String newStr  =  s1+s2;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<newStr.length();i++){
         if(!map.containsKey(newStr.charAt(i))){
             map.put(newStr.charAt(i),1);
         }
         else {
             map.put(newStr.charAt(i),(map.get(newStr.charAt(i))+1));
         }
        }
       Set<Map.Entry<Character,Integer>> set =  map.entrySet();
        for(Map.Entry<Character,Integer> kv :set){
            if(kv.getValue()==1){
                System.out.println(kv.getKey());
            }
        }
    }
}
