package geeksForGeeks.stringsProblems;

public class PrintFirstLetterOfString {
    /**
     * Given a string S, the task is to create a string with the first letter of every word in the string.
     *
     * Input:
     * S = "geeks for geeks"
     * Output: gfg
     *
     *
     * Input:
     * S = "bad is good"
     * Output: big
     * @param args
     */
    public static void main(String[] args) {
        String str ="bad is good and me";
        String [] splitStr = str.split(" ");
        String newStr ="";
        for(int i=0;i<splitStr.length;i++){
            newStr=newStr+splitStr[i].substring(0,1);
        }
        System.out.println(newStr);
    }
}
