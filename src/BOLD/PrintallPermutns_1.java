package BOLD;

public class PrintallPermutns_1 {
    public static void main(String[] args) {
        String str = "USA";
       getAllPermulation(" ",str);
    }

    static void getAllPermulation(String prefix, String str){
        int len = str.length();
        if(len==0){
            System.out.println(prefix);
        }
        else {
            for(int i=0;i<str.length();i++){
                String s1 = prefix+str.charAt(i);
                String  s2 = str.substring(0,i);
                String s3 = str.substring(i+1,len);
                getAllPermulation(s1,s2+s3);
            }
        }
    }
}
