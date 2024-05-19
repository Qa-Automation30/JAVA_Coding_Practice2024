package geeksForGeeks.stringsProblems;
// This solution done by me
import java.util.*;

public class MaximumOccuringCharacter_1 {
    public static void main(String[] args) {
        String str  ="testsample";
        HashMap<Character,Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
            else {
                map.put(str.charAt(i),(map.get(str.charAt(i))+1));
            }
        }
       Set<Map.Entry<Character,Integer>> set =  map.entrySet();
        for(Map.Entry<Character,Integer> kv : set){
            if(kv.getValue()>1){
                list.add(kv.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
