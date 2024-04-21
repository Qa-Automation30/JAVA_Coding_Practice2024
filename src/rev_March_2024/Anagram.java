package rev_March_2024;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 ="Silent";

        char [] c1 = str1.toLowerCase().toCharArray();
        char [] c2 = str2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
