package April_Rev_2024;

import java.util.HashMap;
import java.util.Set;

public class FindUniqueNumberInArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,1,2,3,4,5,6,7,100,100,7};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],(map.get(arr[i])+1));
            }
        }
        System.out.println(map);

       Set<Integer> keys =  map.keySet();
       for(int num: keys){
            if(num>1){
                System.out.println(num+"<---->"+map.get(num));
            }
       }
    }
}
