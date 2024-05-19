package geeksForGeeks.arraysProblems;

import java.util.Collections;
import java.util.HashMap;

/**
 * Given an array a of size N which contains elements from 0 to N-1,
 * you need to find all the elements occurring more than once in the given array. Return the answer in ascending order.
 * If no such element is found, return list containing [-1].
 */

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int [] arr ={0,3,1,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                map.put(j, (map.get(j)) + 1);
            }
        }
        System.out.println(map);

        int maxValue = Collections.max(map.values());
        if(maxValue>1){
            System.out.println("duplicate found in this array");
        }
        else {
            System.out.println("No duplicate found in this array");
        }
    }
}
