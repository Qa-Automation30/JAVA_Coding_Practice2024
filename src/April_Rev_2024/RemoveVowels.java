package April_Rev_2024;

public class RemoveVowels {
    public static void main(String[] args) {
        String str =  "This is the string and need to remove vowels";
        //1st method-->
        String s = str.replaceAll("[aeiouAEIOU]","");
        System.out.println(s);


//        // 2nd Method-->
//        String newStr ="";
//        for(int i=0;i<str.toLowerCase().length();i++){
//            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
//            }
//            else {
//                newStr=newStr+str.charAt(i);
//            }
//        }
//        System.out.println(newStr);
    }
}
