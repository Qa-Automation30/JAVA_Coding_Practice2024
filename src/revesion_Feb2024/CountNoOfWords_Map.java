package revesion_Feb2024;

import java.util.HashMap;

public class CountNoOfWords_Map {
    public static void main(String[] args) {
        String str = "This is my java string and java is a good language This";
        String [] newStr = str.split(" ");
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
    }
}
