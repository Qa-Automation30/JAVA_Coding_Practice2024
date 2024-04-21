package April_Rev_2024;

public class BoldinterviewQuestion {

    public static void main(String[] args) {
        String abc= "USA";
        getAllPermutation("",abc);
    }

   static void getAllPermutation(String prefix,String str){
        int len = str.length();
        if(len==0){
            System.out.println(prefix);
        }
        else{
            for(int i=0;i<len;i++){
                getAllPermutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,len));
            }
        }
   }
}
