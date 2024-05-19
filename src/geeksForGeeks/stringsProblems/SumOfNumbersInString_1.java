package geeksForGeeks.stringsProblems;
// Solved by me without help
public class SumOfNumbersInString_1 {
    /**
     * /**
     *      * Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.
     *      *    Input:
     *      * str = 1abc23
     *      * Output: 24
     *      * Explanation: 1 and 23 are numbers in the
     *      * string which is added to get the sum as
     *      * 24.
     *      *
     *      *     Input:
     *      * str = geeks4geeks
     *      * Output: 4
     *      * Explanation: 4 is the only number, so the
     *      * sum is 4.
     *      * @param args
     */
    public static void main(String[] args) {
        String str  = "geeks4geeks";
        String [] newStr =  str.replaceAll("[a-zA-Z]","-").split("-");
        int sum=0;
        for (int i=0;i<newStr.length;i++){
            if(newStr[i]!=""){
                int num  = Integer.parseInt(newStr[i]);
                sum = sum+num;
            }
        }
        System.out.println(sum);

    }
}
