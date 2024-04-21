package revesion_Feb2024;

import java.util.HashMap;
import java.util.Map;

public class CountNumOfChar_UsingMap {
    public static void main(String[] args) {
        String str = "Tanisha shrivastava";
        char [] c1 = str.replace(" ","").toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c: c1){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else {
                map.put(c,map.get(c)+1);
            }
        }
        System.out.println(map);
    }
}
