package April_Rev_2024;

import java.util.HashSet;
import java.util.Set;

public class CG {
    public static void main(String[] args) {
      /*  String[] names1 = new String[] {"Ava", "Emma", "Olivia", "Emma"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma", "Sophia"};
        List<String> list = new ArrayList<>();

        for(int i=0;i<names1.length;i++){
            for(int j=0;j<names2.length;j++){
                if(names1[i]!=names2[j]){
                    if(!list.contains(names1[i])){
                        list.add(names1[i]);
                    }
                }
            }
        }
        System.out.println(list);*/

        String[] names1 = new String[] {"Ava", "Emma", "Olivia", "Emma"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma", "Sophia"};

        // Create a set to store unique names
        Set<String> uniqueNames = new HashSet<>();

        // Add all names from names1 to the set
        for (String name : names1) {
            uniqueNames.add(name);
        }

        // Add all names from names2 to the set
        for (String name : names2) {
            uniqueNames.add(name);
        }

        // Print out the unique names
        System.out.println("Unique names:");
        System.out.println(uniqueNames);
       /* for (String name : uniqueNames) {
            System.out.println(name);
        }*/
    }
}
