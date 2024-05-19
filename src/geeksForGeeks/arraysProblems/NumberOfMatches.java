package geeksForGeeks.arraysProblems;
// https://www.geeksforgeeks.org/problems/number-of-matches1120/1?page=13&category=Arrays&difficulty=Easy&sortBy=submissions
import java.util.Arrays;
import java.util.HashMap;

public class NumberOfMatches {

    public static void main(String[] args) {
        int [] arr  = {7, 1, 5, 3, 9};
        Arrays.sort(arr);
        HashMap<String,Integer> map = new HashMap<>();
        int len = arr.length;

        for(int i=0;i<arr.length;i++){
            if(len%2==0){

            }
            else {
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){

                    }
                }
            }
        }
    }
}
