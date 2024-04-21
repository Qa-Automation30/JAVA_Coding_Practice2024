package mapConecpt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        // Just Printing the map
        System.out.println(map);
        System.out.println("===================================");
        Set<Integer> keys = map.keySet();  // It returns the Set view containing all the keys.
        for(int val: keys){
            System.out.println(val+"--->"+map.get(val));
        }
        System.out.println("===================================");
        Set<Map.Entry<Integer,String>> set = map.entrySet();  // It returns the Set view containing all the keys and values.
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> e = it.next();
            System.out.println(e.getKey()+"--->"+e.getValue());
        }
        System.out.println("===================================");
    }
}
