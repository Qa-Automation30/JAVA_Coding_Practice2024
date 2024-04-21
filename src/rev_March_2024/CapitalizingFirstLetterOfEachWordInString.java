package rev_March_2024;

public class CapitalizingFirstLetterOfEachWordInString {
    public static void main(String[] args) {
        String str ="i am a test engineer and working as qa";
        String[] split = str.split(" ");
        String newStr="";
        for(int i=0;i<split.length;i++){
               newStr=newStr+" "+split[i].substring(0,1).toUpperCase()+split[i].substring(1).toLowerCase();
        }
        System.out.println(newStr);
    }
}
