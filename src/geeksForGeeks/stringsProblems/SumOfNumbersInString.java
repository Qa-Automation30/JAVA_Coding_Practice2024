package geeksForGeeks.stringsProblems;

import java.util.Objects;

public class SumOfNumbersInString {
    /**
     * Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.
     *    Input:
     * str = 1abc23
     * Output: 24
     * Explanation: 1 and 23 are numbers in the
     * string which is added to get the sum as
     * 24.
     *
     *     Input:
     * str = geeks4geeks
     * Output: 4
     * Explanation: 4 is the only number, so the
     * sum is 4.
     * @param args
     */
    public static void main(String[] args) {
        String str = "geeks4geeks";
        String newStr = str.replaceAll("[a-zA-z]","-");
        String [] str1 = newStr.split("-");
        int sum=0;
        for(int i=0;i<str1.length;i++){
            if(!Objects.equals(str1[i], "")){
                int num = Integer.parseInt(str1[i]);
                sum=sum+num;
            }
        }
        System.out.println(sum);
    }
}
