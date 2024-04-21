package geeksForGeeks.stringsProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Given a string str of lowercase alphabets. The task is to find the maximum occurring character in the string str.
 * If more than one character occurs the maximum number of time then print the lexicographically smaller character.
 *
 *
 * Input:
 * str = testsample
 * Output: e
 * Explanation: e is the character which
 * is having the highest frequency.
 *
 *
 * Input:
 * str = output
 * Output: t
 * Explanation:  t and u are the characters ith the same frequency, but t is lexicographically smaller.
 */
public class MaximumOccuringCharacter {
    public static void main(String[] args) {
       String str = "output";
       char[] c1 = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<c1.length;i++){
            if(!map.containsKey(c1[i])){
                map.put(c1[i],1);
            }
            else {
                map.put(c1[i],map.get(c1[i])+1);
            }
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(map.get(a) == map.get(b))return a.compareTo(b);
            else return map.get(b)-map.get(a);
        });
        System.out.println(list.get(0));
    }
}
