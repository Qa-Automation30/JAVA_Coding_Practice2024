package geeksForGeeks.stringsProblems;

import java.util.Locale;

public class CrazyString {
    /**
     * You have given a non-empty string. This string can consist of lowercase and uppercase english alphabets.
     * Convert the string into an alternating sequence of lowercase and uppercase characters without changing
     * the character at the 0th index.
     *
     * Input:
     * S = "geeksforgeeks"
     * Output: gEeKsFoRgEeKs
     * Explanation: The first character is kept
     * unchanged whereas all the characters are
     * arranged in alternating order of lowercase
     * and uppercase.
     *
     *  Input:
     * S = "Geeksforgeeks"
     * Output: GeEkSfOrGeEkS
     * Explanation: The first character is kept
     * unchanged whereas all the characters are
     * arranged in alternating order of lowercase
     * and uppercase.
     */

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String newStr = "";
        newStr=""+str.charAt(0);

        if(Character.isUpperCase(str.charAt(0))){
            for(int i=1;i<str.length();i++){
                if(i%2==0){
                    newStr=newStr+Character.toUpperCase(str.charAt(i));
                }
                else {
                    newStr=newStr+Character.toLowerCase(str.charAt(i));
                }
            }
        }
        else {
            for(int i=1;i<str.length();i++){
                if(i%2==1){
                    newStr=newStr+Character.toUpperCase(str.charAt(i));
                }
                else {
                    newStr=newStr+Character.toLowerCase(str.charAt(i));
                }
            }
        }
        System.out.println(newStr);
    }
}
