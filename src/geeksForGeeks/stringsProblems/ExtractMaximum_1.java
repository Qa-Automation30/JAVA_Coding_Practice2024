package geeksForGeeks.stringsProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractMaximum_1 {
    public static void main(String[] args) {
        String str  = "100klh564abc365bg";
        String [] newStr  = str.replaceAll("[a-zA-Z]"," ").split(" ");
        int [] arr = new int[newStr.length];
        for(int i=0;i<newStr.length;i++){
            if(newStr[i]!=""){
              arr[i] =  Integer.parseInt(newStr[i]);
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
