package geeksForGeeks.arraysProblems;
// Asked in EPAM interview Questions.
// Need to do , this is left in b/w
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array A of positive integers. Your task is to find the leaders in the array.
 * An element of array is a leader if it is greater than or equal to all the elements to its right side.
 * The rightmost element is always a leader.
 *
 *   Input:
 * n = 6
 * A[] = {16,17,4,3,5,2}
 * Output: 17 5 2
 * Explanation: The first leader is 17 as it is greater than all the elements to its right.  Similarly, the next
 * leader is 5. The right most element
 * is always a leader so it is also
 * included.
 *
 * Input:
 * n = 5
 * A[] = {1,2,3,4,0}
 * Output: 4 0
 * Explanation: 0 is the rightmost element
 * and 4 is the only element which is greater
 * than all the elements to its right.
 */
public class LeadersInArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int [] arr ={16,17,4,3,5,2};

        for(int i=0;i<arr.length;i++){
            int num1 = arr[i];
            int j;
            for(j=i+1;j<arr.length;j++){
                int num2 =arr[j];
                if(num1<=num2){
                    break;
                }
            }
            if(j==arr.length){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
