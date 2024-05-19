import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNumOfChar_UsingMap {

    public static void main(String[] args) {
        String str ="This is my string and I need to count the occurrence of character";
        char[] ch = str.replaceAll(" ","").toLowerCase().toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : ch) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, (map.get(c)) + 1);
            }
        }
        Set<Map.Entry<Character,Integer>> set =   map.entrySet();
        for(Map.Entry<Character,Integer> kv : set){
            System.out.println(kv.getKey()+"--->"+kv.getValue());
        }

    }
}
