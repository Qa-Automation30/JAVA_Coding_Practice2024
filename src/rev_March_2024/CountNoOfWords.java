package rev_March_2024;

import java.util.HashMap;
import java.util.Set;

public class CountNoOfWords {
    public static void main(String[] args) {
        String str = "This is my java string and java is a good language";
        String [] newStr =  str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : newStr){
            if(!map.containsKey(s)){
                map.put(s,1);
            }
            else {
                map.put(s,map.get(s)+1);
            }
        }
        System.out.println(map);
        Set<String> keys  = map.keySet();
        for(String key : keys){
            if(map.get(key)>=2){
                System.out.println(key);
            }
        }
    }
}
