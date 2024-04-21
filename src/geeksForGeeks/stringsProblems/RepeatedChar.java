package geeksForGeeks.stringsProblems;

public class RepeatedChar {
    /**
     * Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.
     *
     *
     * Input:
     * S = "geeksforgeeks"
     * Output: g
     * Explanation: g, e, k and s are the repeating
     * characters. Out of these, g occurs first.
     *
     *
     *Input:
     * S = "abcde"
     * Output: -1
     * Explanation: No repeating character present. (You need to return '#')
     *
     * @param args
     */
    public static void main(String[] args) {
        String str ="geeksforgeeks";
       System.out.println(firstRepeatingChar(str));

    }
    static char firstRepeatingChar(String str){
        char [] c1 = str.toCharArray();
        char ch = 0;
        for(int i=0;i<c1.length;i++){
            int count=1;
            for(int j=i+1;j<c1.length;j++){
                if(c1[i]==c1[j]){
                    count++;
                    ch =c1[j];
                }
            }
            if(count>1){
                return ch;
            }
        }
        return '#';
    }
}
