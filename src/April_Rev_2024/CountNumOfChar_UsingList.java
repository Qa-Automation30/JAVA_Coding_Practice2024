package April_Rev_2024;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumOfChar_UsingList {

    public static void main(String[] args) {
        String str ="Tomorrow you will get selected";
        String newStr = str.replaceAll(" ","").toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<newStr.length();i++){
            if(!map.containsKey(newStr.charAt(i))){
                map.put(newStr.charAt(i),1);
            }
            else {
                map.put(newStr.charAt(i),(map.get(newStr.charAt(i))+1));
            }
        }
        System.out.println(map);
        //==============================================
         Set<Map.Entry<Character,Integer>> set =  map.entrySet();

         for(Map.Entry<Character,Integer> m:set){
             if(m.getValue()>1){
                 System.out.println(m.getKey()+"-----"+m.getValue());
             }
         }

    }
}
