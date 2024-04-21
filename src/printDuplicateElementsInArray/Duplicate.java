package printDuplicateElementsInArray;

import java.util.HashMap;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int num [] ={100,200,100,200,300};
        // Find and print duplicate element in Array
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<num.length;i++){
            if(!map.containsKey(num[i])){
                map.put(num[i],1);
            }
            else {
                map.put(num[i],map.get(num[i])+1);
            }
        }
        Set<Integer> keys = map.keySet();
        for(Integer key:keys){
            if(map.get(key)>1){
                System.out.println((key)+"--->"+map.get(key));
            }
        }
    }
}
