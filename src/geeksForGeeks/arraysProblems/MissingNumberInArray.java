package geeksForGeeks.arraysProblems;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int [] arr  ={6,1,2,8,3,4,7,10,5,13};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int prev = arr[0];
        for(int i=0;i<arr.length;i++){
            int gap = arr[i]-prev;
            if((gap-1)==1){
                System.out.println(prev+1);
            }
            else if(gap>1) {
                System.out.println(prev+1);
                System.out.println(arr[i]-1);
            }
            prev= arr[i];
        }
    }
}
