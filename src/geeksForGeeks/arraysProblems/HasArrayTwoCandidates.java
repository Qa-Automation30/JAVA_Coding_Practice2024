package geeksForGeeks.arraysProblems;

import java.util.Arrays;

/**
 * Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
 *
 * Input:
 * N = 6, X = 16
 * Arr[] = {1, 4, 45, 6, 10, 8}
 * Output: Yes
 * Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
 *
 * Input:
 * N = 5, X = 10
 * Arr[] = {1, 2, 4, 3, 6}
 * Output: Yes
 * Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
 */
public class HasArrayTwoCandidates {
    public static void main(String[] args) {

        int [] arr = {1, 4, 45, 6, 10, 8};
        int sum= 16;
        int [] newArr;
        newArr = getIndexOfSum(arr,sum);
        System.out.println(Arrays.toString(newArr));

    }
    static int[] getIndexOfSum(int [] arr, int sum){
        int i;
        for(i=0;i< arr.length;i++){
            int num1 = arr[i];
            int j;
            for(j=i+1;j<arr.length;j++){
                int num2 = arr[j];
                if(num1+num2==sum){
                    return new int [] {i,j};
                    }
                }
            }
        return new int[]{0};
    }

    }
