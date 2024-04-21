package revesion_Feb2024;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindLongestWorldInString {
    public static void main(String[] args) {
        String str = "This is the java language and thisIsALongestWorld in String";
        Map<Integer, String> map = new HashMap<>();
        String[] newStr = str.split(" ");
        for(String s :newStr){
            map.put(s.length(),s);
        }
        System.out.println(map);
        System.out.println(map.get(Collections.max(map.keySet())));
    }
}
