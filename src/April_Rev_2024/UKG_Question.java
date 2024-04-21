package April_Rev_2024;

public class UKG_Question {
    // Get the first non repeating character from String
    public static void main(String[] args) {
        String s = "ABCEABCF";
        System.out.println(getFirstNonRepChar(s));
    }

    static char getFirstNonRepChar(String word){
        for(int i=0;i<word.length();i++){
            int count=1;
            for(int j=i+1;j<word.length();j++){
                if(word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return word.charAt(i);
            }
        }
        return 0;
    }
}
