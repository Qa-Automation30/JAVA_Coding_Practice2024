package printDuplicateElementsInArray;

import java.util.HashMap;

public class CountNoOfWords_Map {

    public static void main(String[] args) {
        String str = "This is my java string and java is a good language";
        String [] newStr = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<newStr.length;i++){
            if(!map.containsKey(newStr[i])){
                map.put(newStr[i],1);
            }
            else {
                map.put(newStr[i],map.get(newStr[i])+1);
            }
        }
        System.out.println(map);
    }
}
