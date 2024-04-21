package geeksForGeeks.stringsProblems;
// Solved by me, without any help
/**
 *    Given a string S, the task is to change the complete string to Uppercase or Lowercase depending upon the case for the first character.
 *
 *      Input:
 * S = "abCD"
 * Output: abcd
 * Explanation: The first letter (a) is
 * lowercase. Hence, the complete string
 * is made lowercase.
 *
 *
 *   Input:
 * S = "Abcd"
 * Output: ABCD
 * Explanation: The first letter (A) is
 * uppercase. Hence, the complete string
 * is made uppercase.
 */
public class ChangeTheString {
    public static void main(String[] args) {
        String str = "Abcd";
        System.out.println(changeString(str));

    }
    static String changeString(String str){
        String newStr="";
        if(Character.isLowerCase(str.charAt(0))){
            newStr=newStr+str.toLowerCase();
        }
        else {
            newStr=newStr+str.toUpperCase();
        }
        return newStr;
    }
}
