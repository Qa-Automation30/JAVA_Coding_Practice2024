package rev_March_2024;

import java.util.Collections;
import java.util.HashMap;

public class FindLongestWorldInString {
    public static void main(String[] args) {
        String str = "This is the java language and thisIsALongestWorld in String";
        String newStr [] = str.split(" ");
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<newStr.length;i++){
            map.put(newStr[i].length(),newStr[i]);
        }
        int value = Collections.max(map.keySet());
        System.out.println(value);

        System.out.println(map.get(value));
    }
}
