package geeksForGeeks.arraysProblems;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
        int [] arr  = {1,2,3,4};
        int [] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            answer[i]=1;
        }
        int prefix =1;
        for(int i=0;i<arr.length;i++){
            answer[i]=prefix;
            prefix = prefix*arr[i];
        }
        int suffix =1;
        for(int i=arr.length-1;i>=0;i--){
            answer[i] = answer[i]* suffix;
            suffix =suffix * arr[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
