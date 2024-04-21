package revesion_Feb2024;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 ="Silent";
       String result = checkAnagram(str1,str2);
       System.out.println(result);
    }

    static String checkAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return "Length of the String is not same, Please check your Strings";
        }
        char[] c1 = str1.toLowerCase().toCharArray();
        char[] c2 = str2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            return "This is anagram.Anagram";
        }
        return "This is not anagram.Anagram";
    }
}
