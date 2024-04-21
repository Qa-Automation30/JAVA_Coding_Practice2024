package geeksForGeeks.stringsProblems;

public class SecondProblem {
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
    static int function(String s1, String s2){
        int slen = s1.length();
        int xlen = s2.length();
        for(int i=0;i<=slen;i++){
            String st = s1.substring(i,i+xlen);
            if(st.equals(s2)){
                return i;
            }
        }
        return -1;
    }
}
/**
 *   if(s1.contains(s2)){
 *            return s1.indexOf("F");
 *         }
 *         return -1;
 */
