package HackerRank;

/**
 *  A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 *
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 *
 * Constraints
 *
 *  will consist at most  lower case english letters.
 * Sample Input
 *
 * madam
 * Sample Output
 *
 * Yes
 */
public class P_3 {
    public static void main(String[] args) {
        String str ="madam";
        validatePalindrome(str);
    }
    static void validatePalindrome(String str){
        String newStr="";
        for(int i=str.length()-1;i>=0;i--){
            newStr=newStr+str.charAt(i);
        }
        if(str.equals(newStr)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
