package revesion_Feb2024;

public class UKG_2024_1 {
    // Get the first non repeating character from String
    public static void main(String[] args) {
        String s ="ABCEABCF";
        System.out.println(getFirstNonRepChar(s));
    }

    static char getFirstNonRepChar(String s){
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return s.charAt(i);
            }
        }
        return '0';
    }
}
