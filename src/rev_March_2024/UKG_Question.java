package rev_March_2024;

public class UKG_Question {
    // Get the first non repeating character from String
    public static void main(String[] args) {
        String s = "ABCEABCF";
        System.out.println(getFirstNonRepChar(s));
    }
    static char getFirstNonRepChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            int count=1;
            for(int j=i+1;j<str.length();j++){
                System.out.println(str.charAt(j));
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return str.charAt(i);
            }
        }
        return 0;
    }
}
