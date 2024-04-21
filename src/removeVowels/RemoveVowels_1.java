package removeVowels;

public class RemoveVowels_1 {
    public static void main(String[] args) {
        String str =  "This is the string and need to remove vowels";
       System.out.println(removeMethod(str));

    }
    static String removeMethod(String str){
        return str.replaceAll("[aeiouAEIOU]","");
    }
}
