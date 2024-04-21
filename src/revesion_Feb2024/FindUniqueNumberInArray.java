package revesion_Feb2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindUniqueNumberInArray {
    public static void main(String[] args) {
        int arr[] ={1000,2000,3000,4000,1000,2000,3000,4000,5000,6000,7000,100,100,7000};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);
        Set<Integer> set = map.keySet();
        for(Integer i: set){
            if(map.get(i)==1){
                System.out.println(map.get(i)+"----"+i);
            }
        }
    }
}
