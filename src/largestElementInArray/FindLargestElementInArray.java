package largestElementInArray;

import java.util.Arrays;

public class FindLargestElementInArray {
    public static void main(String[] args) {
        int [] arr ={1,2,33,4,55,6,7,8,9,10};
        int lenOfArray = arr.length;
        Arrays.sort(arr);
        // Largest element in array
        int largestElement  = arr[lenOfArray-1];
        System.out.println(largestElement);
        //2nd largest element in array
        System.out.println(arr[lenOfArray-2]);

    }
}
