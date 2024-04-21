package revesion_Feb2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindUniqueCharacterInString {
    public static void main(String[] args) {
        String str = "This is test class";
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
        Set<Character> keys = map.keySet();
        for(Character key: keys){
            if(map.get(key)==1){
                System.out.println(key+"---->"+map.get(key));
            }
        }
    }
}
