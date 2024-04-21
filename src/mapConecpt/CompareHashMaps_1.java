package mapConecpt;

import java.util.HashMap;

public class CompareHashMaps_1 {
    //https://www.geeksforgeeks.org/compare-two-hashmap-objects-in-java/
    public static void main(String[] args) {

        //  HashMap1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Akshay");
        map1.put(2, "Bina");
        map1.put(3, "Chintu");

        // HashMap2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Chintu");
        map2.put(2, "Bina");
        map2.put(1, "Akshay");

        // HashMap3
        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Akshay");
        map3.put(2, "Binod");
        map3.put(3, "Chintu");

        // Compare map1 and map2
        //  //  Here we are comparing both Keys and values of the hashmaps
        System.out.println("map1 == map2 : "
                + map1.equals(map2));

        // Compare map1 and map3
        System.out.println("map1 == map3 : "
                + map1.equals(map3));

    }
}
