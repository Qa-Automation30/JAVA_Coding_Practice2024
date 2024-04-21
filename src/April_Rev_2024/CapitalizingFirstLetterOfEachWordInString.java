package April_Rev_2024;

public class CapitalizingFirstLetterOfEachWordInString {
    public static void main(String[] args) {
        String str ="i am a test engineer and working as qa";
        String [] newStr = str.split(" ");
        String newStr1="";
        for(int i=0;i<newStr.length;i++){
            newStr1=newStr1+" "+newStr[i].substring(0,1).toUpperCase()+newStr[i].substring(1).toLowerCase();
        }
        System.out.println(newStr1);
    }
}
