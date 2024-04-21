package April_Rev_2024;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("This is not Anagram");
        }
    }
}
