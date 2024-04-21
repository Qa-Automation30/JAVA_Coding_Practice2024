package LeetCode;

import java.util.Arrays;

public class LeetCode_Problem_1 {

    public static void main(String[] args) {
        String givenStr = "is2 sentence4 this1 a3";
        String[] str = givenStr.split(" ");
        String [] newStr= new String[(str.length)];
        String result ="";
        /**
         *  I want o/p based on the given index at the last of the word in String:
         *  Need to remove the number as well.
         *  Like : this is a sentence
         */
        for(int i=0;i<str.length;i++){
            char c1 = str[i].charAt(str[i].length()-1);
            int numValue = Character.getNumericValue(c1);
            //===================================================
            String subStr = str[i].substring(0,str[i].length()-1);
            newStr[numValue-1] = subStr;
            //====================================================
        }
        System.out.println(String.join(" ",newStr));

    }
}
