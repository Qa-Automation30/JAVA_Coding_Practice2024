package geeksForGeeks.stringsProblems;

import java.util.ArrayList;
import java.util.List;

public class RemoveCharacter {
    /**
     *   Given two strings string1 and string2, remove those characters from first string(string1)
     *   which are present in second string(string2). Both the strings are different and contain only lowercase characters.
     * NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
     *
     *
     *   Input:
     * string1 = "computer"
     * string2 = "cat"
     * Output: "ompuer"
     * Explanation: After removing characters(c, a, t)
     * from string1 we get "ompuer".
     *
     *  Input:
     * string1 = "occurrence"
     * string2 = "car"
     * Output: "ouene"
     * Explanation: After removing characters
     * (c, a, r) from string1 we get "ouene".
     *
     */
    public static void main(String[] args) {
       String string1 = "occurrence";
       String string2 = "car";
       removeChar(string1,string2);

    }

    static void removeChar(String s1, String s2){
        if(s1.length()<s2.length()){
            System.out.println("Please enter valid String");
        }
       String newStr="";
        for(int i=0;i<s1.length();i++){
            int count=1;
            for (int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                newStr=newStr+s1.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
