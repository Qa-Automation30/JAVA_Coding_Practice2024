package geeksForGeeks.stringsProblems;
// Solved by me without any help
public class SecondProblem_1 {

    /**
     * The function takes two strings as arguments (s,x) and  locates the occurrence of the string x in the string s.
     * The function returns an integer denoting the first occurrence of the string x in s (0 based indexing).
     * @param args
     *
     * ababaaaaaa abaa
     */
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String x = "For";
        System.out.println(function(s,x));

    }
    static int function(String str1, String str2){
        int len1 = str1.length();
        int len2 = str2.length();

        for(int i=0;i<len1;i++){
            if((i+len2)<len1){
                String test  = str1.substring(i,i+len2);
                if(test.equalsIgnoreCase(str2)){
                    return i;
                }
            }
        }
        return -1;
    }
}
