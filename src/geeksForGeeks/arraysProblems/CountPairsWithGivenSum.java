package geeksForGeeks.arraysProblems;

/**
 * Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
 *
 * Input:
 * N = 4, K = 6
 * arr[] = {1, 5, 7, 1}
 * Output: 2
 * Explanation:
 * arr[0] + arr[1] = 1 + 5 = 6
 * and arr[1] + arr[3] = 5 + 1 = 6.
 *
 *
 * Input:
 * N = 4, K = 2
 * arr[] = {1, 1, 1, 1}
 * Output: 6
 * Explanation:
 * Each 1 will produce sum 2 with any 1.
 *
 *
 */

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int [] arr= {1, 1, 1, 1};
        int sum =2;
       int output = getResult(arr,sum);
       System.out.println(output);
    }
    static int getResult(int [] num,int sum){
        int count =0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                int num1 = num[i];
                int num2 = num[j];
                if(num1+num2==sum){
                    count++;
                }
            }
        }
        return count;
    }
}
