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
                String str1 =  prefix+str.charAt(i);
                String str2 =  str.substring(0,i);
                String str3 =  str.substring(i+1,len);
               // getAllPermutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,len));
                getAllPermutation(str1,str2+str3);
            }
        }
   }
}
