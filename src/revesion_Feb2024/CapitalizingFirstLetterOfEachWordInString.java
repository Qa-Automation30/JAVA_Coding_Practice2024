package revesion_Feb2024;

public class CapitalizingFirstLetterOfEachWordInString {
    public static void main(String[] args) {
        String str ="i am a test engineer and working as qa";
        String[] testStr = str.split(" ");
        String newStr="";
        for(int i=0;i<testStr.length;i++){
            newStr=newStr+" "+testStr[i].substring(0,1).toUpperCase()+testStr[i].substring(1);
        }
        System.out.println(newStr);
    }
}
