package geeksForGeeks.stringsProblems;

public class RepeatedChar_1 {
    public static void main(String[] args) {
        String str ="geeksforgeeks";
        System.out.println(getFirstRepChar(str));
    }
    static char getFirstRepChar(String str){
        for (int i= 0; i<str.length();i++){
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                return str.charAt(i);
            }
        }
        return '0';
    }
}
