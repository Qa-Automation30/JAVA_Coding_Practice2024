package geeksForGeeks.stringsProblems;

import java.util.Arrays;
// Solved by me only
public class LeetCode_1 {
    public static void main(String[] args) {
        String str = "is2 sentence4 this1 a3";
        String [] newStr  = str.split(" ");
        String [] str1 = new String[newStr.length];
        int len = newStr.length;
        for(int i=0;i<len;i++){
           int index = (Integer.parseInt(newStr[i].replaceAll("[a-zA-Z]","")))-1;
           String strT = newStr[i].replaceAll("[0-9]","");
           str1[index] = strT;
        }
        System.out.println(Arrays.toString(str1));
       String message =  String.join(" ",str1);
       System.out.println(message);
    }
}
