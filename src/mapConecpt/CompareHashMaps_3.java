package mapConecpt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CompareHashMaps_3 {
    public static void main(String[] args) {

        // IN this we are comparing the values of the maps

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
        map3.put(3, "Shinchain");


      List<String> list1 = new ArrayList<>(map1.values());
      System.out.println(list1);

        List<String> list2 = new ArrayList<>(map2.values());
        System.out.println(list2);

        List<String> list3 = new ArrayList<>(map3.values());
        System.out.println(list3);

        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));

    }
}
