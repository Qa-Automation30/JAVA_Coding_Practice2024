package revesion_Feb2024;

import java.util.Arrays;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int num[] ={21,43,100,65,1000,1,2,3,55,78};
        // Largest and Second-Largest number in Array
        int length = num.length;
        Arrays.sort(num);
        System.out.println(num[length-2]);
    }
}
