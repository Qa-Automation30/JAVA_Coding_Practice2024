
import java.util.Collections;
import java.util.HashMap;

public class FindLongestWorldInString {
    public static void main(String[] args) {
        String str = "This is the java language and thisIsALongestWorld in String";
        int length=0;
        String [] arr = str.split(" ");
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            length = arr[i].length();
            map.put(length,arr[i]);
        }
        System.out.println(map);
        int maxValue = Collections.max(map.keySet());
        System.out.println(maxValue);
        System.out.println(map.get(maxValue));
    }
}
