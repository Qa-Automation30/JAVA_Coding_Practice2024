package April_Rev_2024;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoList {
    /**
     * How to find additional element in list while
     * comparing 2 List?
     * If we have 2 list l1 & l2 , first we remove all element
     * of l2
     * L1.removeAll(l2);
     * Sysout(L1) – you will get additional element.
     */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ram");
        list1.add("Laxman");
        list1.add("Japan");
        list1.add("ABC");

        List<String> list2 = new ArrayList<>();
        list2.add("Ram");
        list2.add("Laxman");
        list2.add("Japan");

        list1.removeAll(list2);
        System.out.println(list1);

    }
}
