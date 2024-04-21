package revesion_Feb2024;

import java.util.ArrayList;
import java.util.List;

public class CountNoOfWords_List {
    public static void main(String[] args) {
        String str = "This is my java string and java is a good language";
        String[] newStr = str.split(" ");
        List<String> list = new ArrayList<>();
        for (int i=0;i<newStr.length;i++){
            int count=0;
            if(!list.contains(newStr[i])){
                list.add(newStr[i]);
                for(int j=0;j<newStr.length;j++){
                    if(newStr[i].equals(newStr[j])){
                        count++;
                    }
                }
                System.out.println(newStr[i]+"----"+count);
            }

        }
    }
}
