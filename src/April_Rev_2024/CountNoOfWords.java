package April_Rev_2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountNoOfWords {
    public static void main(String[] args) {
        String str = "This is my java string and java is a good language";
        String [] newStr = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<newStr.length;i++){
            if(!map.containsKey(newStr[i])){
                map.put(newStr[i],1);
            }
            else {
                map.put(newStr[i],(map.get(newStr[i])+1));
            }
        }

        Set<Map.Entry<String,Integer>> test =  map.entrySet();
        for (Map.Entry<String, Integer> str1 : test) {
            if(str1.getValue()>1){
                System.out.println(str1.getKey()+"--->"+str1.getValue());
            }
        }
    }
}
