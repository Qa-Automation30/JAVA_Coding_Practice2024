package April_Rev_2024;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int num [] ={1,2,3,3,2,1,7,5,4,6,8,9,0};

        Set<Integer> set = new HashSet<>();
        for(int num1 :num){
            set.add(num1);
        }
        System.out.println(set);
    }
}
