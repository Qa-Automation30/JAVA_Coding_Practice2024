package findUniqueCharactersInString;

import java.util.HashMap;
import java.util.Set;

public class FindUniqueCharacterInString {
    public static void main(String[] args) {
        String str = "This is test class";
        char[] newArr =  str.replace(" ","").toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character ch:newArr){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else {
                map.put(ch,map.get(ch)+1);
            }
        }
        System.out.println(map);

        Set<Character> set  = map.keySet();
        for(Character ch :set){
            if(map.get(ch)==1){
                System.out.println(ch+" Value is -->"+map.get(ch));
            }
        }

    }
}
