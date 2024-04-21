package geeksForGeeks.stringsProblems;

import java.util.Collections;
import java.util.HashMap;

public class isIsogram {
    /**
     * Given a string S of lowercase alphabets, check if it is isogram or not. An Isogram is a string in which no letter occurs more than once.
     * <p>
     * Input:
     * S = machine
     * Output: 1
     * Explanation: machine is an isogram
     * as no letter has appeared twice. Hence
     * we print 1.
     * <p>
     * Input:
     * S = geeks
     * Output: 0
     * Explanation: geeks is not an isogram
     * as 'e' appears twice. Hence we print 0.
     *
     * @param args
     */
    public static void main(String[] args) {
        //String str = "machine";
        String str = "geeks";
        System.out.println(checkIsogram(str));
    }

    static boolean checkIsogram(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        int maxValue = Collections.max(map.values());
        System.out.println(maxValue);
        if (maxValue == 1) {
            return true;
        }
        return false;
    }
}