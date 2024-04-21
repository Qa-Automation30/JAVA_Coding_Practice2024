package geeksForGeeks.stringsProblems;

import java.util.Arrays;
import java.util.Objects;

/**
 *  Given a alphanumeric string S, extract maximum numeric value from S.
 *
 *  Input:
 * S = 100klh564abc365bg
 * Output: 564
 * Explanation: Maximum numeric value
 * among 100, 564 and 365 is 564.
 *
 *
 *  Input:
 * S = abcdefg
 * Output: -1
 * Explanation: Return -1 if no numeric
 * value is present.
 *
 */
//  // This is my solution and working fine [it is working but not optimized].
public class ExtractMaximum {
    public static void main(String[] args) {

        String str = "100klh564abc365bg";
       String [] st = str.replaceAll("[A-Za-z]","-").split("-");
       int[] num = new int[st.length];
       if(st.length>0){
           for(int i=0;i<st.length;i++){
               if(!Objects.equals(st[i], "")){
                   num[i] = Integer.parseInt(st[i]);
               }
           }
           int len = num.length;
           Arrays.sort(num);
           System.out.println(num[len-1]);
       }
       else {
           System.out.println("NO Numeric Char");
       }
    }

}
