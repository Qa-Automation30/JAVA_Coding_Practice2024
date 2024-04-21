package mapConecpt;

import java.util.HashMap;
import java.util.Set;

public class CompareHashMaps_2 {

    public static void main(String[] args) {
        // New HashMap1
        HashMap<Integer, String> map1 = new HashMap<>();
        // Add Entry to map
        map1.put(1, "Akshay");
        map1.put(2, "Bina");
        map1.put(3, "Chintu");

        // New HashMap2
        HashMap<Integer, String> map2 = new HashMap<>();
        // Add Entry to map
        map2.put(3, "Chintu");
        map2.put(2, "Bina");
        map2.put(1, "Akshay");

        // New HashMap3
        HashMap<Integer, String> map3 = new HashMap<>();
        // Add Entry to map
        map3.put(1, "Akshay");
        map3.put(2, "Binod");
        map3.put(4, "Chintu");

        //  Here we are comparing the Keys of HashMap
        Set<Integer> key1 = map1.keySet();
       Set<Integer> key2 = map2.keySet();
        Set<Integer> key3 = map3.keySet();

       System.out.println("Map1 and Map2 --->  "+key1.equals(key2));
        System.out.println("Map1 and Map3 --->  "+key1.equals(key3));
    }
}
