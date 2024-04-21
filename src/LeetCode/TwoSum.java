package LeetCode;

import java.sql.Array;
import java.util.Arrays;

public class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order
     */
    public static void main(String[] args) {
        int [] arr = {2,7,20,15,20,56};
        int [] newArr = twoSum(arr,58);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] twoSum(int [] arr, int target){
        if(arr.length>=2){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==target){
                        return new int[]{i,j};
                    }
                    else {
                        return new int[0];
                    }
                }
            }
        }
        return arr;
    }
}
