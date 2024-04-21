package rev_March_2024;

import java.util.HashMap;

public class CountNumOfChar {

    public static void main(String[] args) {
        String str ="This is my string and I need to count the occurrence of character";
        char[] arr = str.replace(" ","").toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(Character ch :arr){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else {
                map.put(ch,map.get(ch)+1);
            }
        }
        System.out.println(map);
    }
}
