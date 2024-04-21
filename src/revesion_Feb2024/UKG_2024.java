package revesion_Feb2024;

public class UKG_2024 {
    // Get the first non repeating character from String
    public static void main(String[] args) {
        String s ="ABCEABCF";
        System.out.println(getFirstNonRepChar(s));
    }
   static char getFirstNonRepChar(String str){
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return str.charAt(i);
            }
        }
        return '0';
    }
}
