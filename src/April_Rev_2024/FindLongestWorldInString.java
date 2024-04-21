package April_Rev_2024;

import java.util.Collections;
import java.util.HashMap;


public class FindLongestWorldInString {
    public static void main(String[] args) {
        String str = "This is the java language and thisIsALongestWorld in String";
        HashMap<Integer, String> map = new HashMap<>();

        String[] splitStr = str.split(" ");
        for (String s : splitStr) {
            map.put(s.length(),s);
        }
        System.out.println(map);

       int val = Collections.max(map.keySet());
       System.out.println(map.get(val));
    }
}
