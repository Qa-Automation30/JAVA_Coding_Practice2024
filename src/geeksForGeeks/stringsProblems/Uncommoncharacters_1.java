package geeksForGeeks.stringsProblems;


import inheritanceConcept.ParentClass;

import java.util.*;
// Solved by me
public class Uncommoncharacters_1 {
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "geeksquiz";

        String newStr = str1+str2;
        System.out.println(newStr);

        List<Character> list = new ArrayList<>();

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<newStr.length();i++){
            if(!map.containsKey(newStr.charAt(i))){
                map.put(newStr.charAt(i),1);
            }
            else {
                map.put(newStr.charAt(i),(map.get(newStr.charAt(i))+1));
            }
        }
        Set<Map.Entry<Character,Integer>> set =  map.entrySet();
        for(Map.Entry<Character,Integer> kv : set){
            if(kv.getValue()<2){
                list.add(kv.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
