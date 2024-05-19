package April_Rev_2024;

import java.util.*;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int num [] ={100,1,2,3,3,2,1,7,5,4,6,8,9,0,1,2};
        // Method 1 --> This removing the duplicate and keep the one occurrence of duplicate.
        Set<Integer> set = new HashSet<>();
        for(int num1 :num){
            set.add(num1);
        }
        System.out.println(set);

        // Method 2 --> This method just remove all the duplicates . so in interview it can be asked like that as well
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(!map.containsKey(num[i])){
                map.put(num[i],1);
            }
            else {
                map.put(num[i],(map.get(num[i]))+1);
            }
        }
        System.out.println(map);
        Set<Map.Entry<Integer,Integer>> set1 =  map.entrySet();
        for(Map.Entry<Integer,Integer> kv :set1){
            if(kv.getValue()==1){
                list.add(kv.getKey());
            }
        }
        System.out.println(list);
    }
}
