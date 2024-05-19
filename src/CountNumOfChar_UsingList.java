import java.util.ArrayList;
import java.util.List;

public class CountNumOfChar_UsingList {
    /**
     * This is the first way to do this , you can do it via hashMap as well
     * @param args
     */
    public static void main(String[] args) {
        String str ="This is my string and I need to count the occurrence of character";
        List<Character> chList = new ArrayList<>();
        char ch[] = str.toLowerCase().replace(" ","").toCharArray();

        for(int i=0;i<ch.length;i++){
            int count =0;
            if(!chList.contains(ch[i])){
                chList.add(ch[i]);
                for(int j=0;j<ch.length;j++){
                    if(ch[i]==ch[j]){
                        count++;
                    }
                }
                System.out.println(ch[i]+"--->"+count);
            }

        }

    }
}
