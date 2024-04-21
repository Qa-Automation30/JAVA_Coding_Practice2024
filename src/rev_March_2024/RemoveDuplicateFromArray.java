package rev_March_2024;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int num [] ={1,2,3,3,2,1,7,5,4,6,8,9,0};

        // 1st approach -> Use Set-->
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }
        System.out.println(set);
    }
}
