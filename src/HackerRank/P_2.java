package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
 */

// https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
public class P_2 {
    public static void main(String[] args) {
        getResult("welcometojava",3);
    }
    static void getResult(String str, int number){
        List<String> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            int len  = str.length();
            int add  = i+number;
            if (add<=len){
                System.out.println(i+","+(i+number));
                list.add(str.substring(i,i+number));
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(10));

    }
}
