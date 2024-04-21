package April_Rev_2024;

import java.util.HashMap;

public class FindUniqueCharacterInString {

    public static void main(String[] args) {
        String str = "This is test class";
        char[] c1 = str.replaceAll(" ","").toLowerCase().toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : c1) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, (map.get(c) + 1));
            }
        }
        System.out.println(map);
    }
}
