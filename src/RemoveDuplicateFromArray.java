import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int num [] ={1,2,3,3,2,1,7,5,4,6,8,9,0};
        // 1st approach is using set
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }
        System.out.println(set);

        //2nd approach-->
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<num.length;i++){
            if(!list.contains(num[i])){
                list.add(num[i]);
            }
        }
        System.out.println(list);
    }
}
