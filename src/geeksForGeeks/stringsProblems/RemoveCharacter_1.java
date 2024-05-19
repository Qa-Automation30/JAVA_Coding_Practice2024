package geeksForGeeks.stringsProblems;

import java.util.ArrayList;
import java.util.List;

public class RemoveCharacter_1 {

    public static void main(String[] args) {
        String string1 = "occurrence";
        String string2 = "car";

        // Output: "ouene"

        removeChar(string1,string2);
    }

    static void removeChar(String str1,String str2){
        if(str1.length()<str2.length()){
            System.out.println("Please Enter the valid String");
        }
        String newStr="";
        for(int i=0;i<str1.length();i++){
            int count=1;
            for (int j=0;j<str2.length();j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                newStr+= str1.charAt(i);
            }
            }
        System.out.println(newStr);
    }
}
