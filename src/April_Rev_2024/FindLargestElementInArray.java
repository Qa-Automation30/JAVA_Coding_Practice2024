package April_Rev_2024;

import java.util.Arrays;

public class FindLargestElementInArray {

    public static void main(String[] args) {
        int [] arr ={1,2,33,4,55,6,7,8,9,10};
        int len = arr.length;
        Arrays.sort(arr);

        System.out.println(arr[len-1]);
    }
}
