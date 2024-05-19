package geeksForGeeks.stringsProblems;
// Solved by me only without help
public class ReverseString_1 {
    public static void main(String[] args) {

        String actualString = "MY PHONE HANGS"; //Expected = > "YM ENOHP SGNAH
        Method3(actualString);
        //====================================
        String actualString1 = "MY PHONE HANGS"; //Expected = > "SGNAH ENOHP YM
        Method4(actualString1);
    }
    static void Method3(String str){
        String [] newStr = str.split(" ");
        String newStr1="";
        for(int i=0;i<newStr.length;i++){
            String str1 = newStr[i];
            for(int j=str1.length()-1;j>=0;j--){
                newStr1 = newStr1 + str1.charAt(j);
            }
            newStr1=newStr1+" ";
        }
        System.out.println(newStr1);

    }

    static void Method4(String str){
        String [] newStr = str.split(" ");
        String newStr1="";
        for(int i=newStr.length-1;i>=0;i--){
            String str1 = newStr[i];
            for(int j=str1.length()-1;j>=0;j--){
                newStr1 = newStr1 + str1.charAt(j);
            }
            newStr1=newStr1+" ";
        }
        System.out.println(newStr1);

    }
}
