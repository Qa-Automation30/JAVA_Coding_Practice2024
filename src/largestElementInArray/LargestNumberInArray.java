package largestElementInArray;

import java.util.Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int num[] ={21,43,100,65,1000,1,2,3,55,78};
        int lengthOfArray = num.length;
        Arrays.sort(num);
        // Largest number from an array
        System.out.println(num[lengthOfArray-1]);
        // 2nd Largest number from an array
        System.out.println(num[lengthOfArray-2]);
    }
}
