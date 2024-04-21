package anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String str1 = "Listen";
        String str2 ="Silent";

        char c1 []= str1.toLowerCase().toCharArray();
        char c2 []= str2.toLowerCase().toCharArray();
        System.out.println(c1);
        System.out.println(c2);

        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println(c1);
        System.out.println(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("This is an anagram.Anagram");
        }
        else {
            System.out.println("This is not an anagram.Anagram");
        }
    }
}
