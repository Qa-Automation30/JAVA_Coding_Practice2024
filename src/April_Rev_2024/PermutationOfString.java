package April_Rev_2024;

public class PermutationOfString {
    public static void main(String[] args) {
        String str ="USA";
        getAllPermutation("",str);
    }

    static void getAllPermutation(String prefix, String str){
        int length = str.length();
        if(length==0){
            System.out.println(prefix);
        }
        else {
            for(int i=0;i<length;i++){
                getAllPermutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,length));
            }
        }
    }
}
