package geeksForGeeks.stringsProblems;

import java.util.Arrays;

public class LeetCode {
    public static void main(String[] args) {
        String givenStr = "is2 sentence4 this1 a3";
        /**
         * I want o/p based on the given index at the last of the word in String: Need to remove the number as well.
         *          * o/p=> Like : this is a sentence
         */
        String [] str = givenStr.split(" ");
        String [] newArr = new String[str.length];
        for(int i=0;i<str.length;i++){
           int index= Integer.parseInt(str[i].replaceAll("[^0-9]",""))-1;
           String str1 = str[i].replaceAll("[^A-Za-z]","");
           newArr[index] = str1;
        }
        /**
         * To create a string from the given array of strings [this, is, a, sentence],
         * you can concatenate the elements of the array with spaces between them. Here's how you can do it:
         */
        String message = String.join(" ",newArr);
        System.out.println(message);

    }
}
