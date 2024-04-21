package geeksForGeeks.stringsProblems;
// Need to do more, This solution is not perfect
public class MergeTwoStrings {
    /**
     *  Given two strings S1 and S2 as input, the task is to merge them alternatively i.e.
     *  the first character of S1 then the first character of S2 and so on till the strings end.
     * NOTE: Add the whole string if other string is empty.
     *
     *
     *    Input:
     * S1 = "Hello" S2 = "Bye"
     * Output: HBeylelo
     * Explanation: The characters of both the
     * given strings are arranged alternatlively.
     *
     * Input:
     * S1 = "abc", S2 = "def"
     * Output: adbecf
     * Explanation: The characters of both the
     * given strings are arranged alternatlively.
     *
     * @param args
     */
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "Bye";
        mergeTwoStrings(S1,S2);
    }
    static void mergeTwoStrings(String s1, String s2){
        String newStr="";
        // S1 = "Hello" S2 = "Bye"
        // Output: HBeylelo
       int len = s2.length();
       int remLen = s1.length()-s2.length();
       for(int i=0;i<len;i++){
           newStr=newStr+s1.charAt(i)+s2.charAt(i);
       }
       if(s1.length()!=s2.length()){
           for (int i=remLen+1;i<s1.length();i++){
               newStr=newStr+s1.charAt(i);
           }
       }
       System.out.println(newStr);
    }
}
