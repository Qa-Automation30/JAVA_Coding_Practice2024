package geeksForGeeks.stringsProblems;
// Got the solution by me but still need to practice
public class MergeTwoStrings_1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Bye";
        mergeTwoString(s1,s2);
    }
    static void mergeTwoString(String s1, String s2){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s2.length();i++){
            str.append(s1.charAt(i)).append(s2.charAt(i));
        }
        int remLen = s1.length()-s2.length();
        for(int j=remLen+1;j<s1.length();j++){
            str.append(s1.charAt(j));
        }
        System.out.println(str);
    }
}
