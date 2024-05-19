import java.util.Collections;
import java.util.HashMap;

public class FindStringHasUniqChar {

    /**
     *  Need to validate that if String has all unique charter or not.
     */
    public static void main(String[] args) {
        String str = "this is a string";
        String nStr =  str.replaceAll(" ","").trim();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<nStr.length();i++){
            if(nStr.charAt(i)!=' '){
                if(!map.containsKey(nStr.charAt(i))){
                    map.put(nStr.charAt(i),1);
                }
                else {
                    map.put(nStr.charAt(i),(map.get(nStr.charAt(i))+1));
                }
            }
        }
       int maxValue =  Collections.max(map.values());
        if(maxValue==1){
            System.out.println("String has all unique character");
        }
        else {
            System.out.println("String does not have all unique character");
        }
    }
}
