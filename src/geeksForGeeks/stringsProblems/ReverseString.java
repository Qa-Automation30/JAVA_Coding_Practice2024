package geeksForGeeks.stringsProblems;

public class ReverseString {
    String newStr="";
    public static void main(String[] args) {

        String str1 = "string";  //op -> gnirts
        Method1(str1);
        //====================================
        String str2 ="This is the String"; // String the is This;
        Method2(str2);
        //====================================
        String actualString = "MY PHONE HANGS"; //Expected = > "YM ENOHP SGNAH
        Method3(actualString);
        //====================================
        String actualString1 = "MY PHONE HANGS"; //Expected = > "SGNAH ENOHP YM
        Method4(actualString1);
    }

    static void Method1(String str){
        String newStr ="";
        for(int i=str.length()-1;i>=0;i--){
            newStr=newStr+str.charAt(i);
        }
        System.out.println(newStr);
    }
    static void Method2(String str){
        String[] splitStr = str.split(" ");
        String newStr="";
        for(int i=splitStr.length-1;i>=0;i--){
            newStr=newStr+" "+splitStr[i];
        }
        System.out.println(newStr.trim());
    }
    static void Method3(String str){
        String[] splitStr = str.split(" ");
        String newStr="";
        for(int i=0;i<splitStr.length;i++){
            String str1 = splitStr[i];
            for(int j=str1.length()-1;j>=0;j--){
                newStr=newStr+str1.charAt(j);
            }
            newStr=newStr+" ";
        }
        System.out.println(newStr);
    }
    static void Method4(String str){
        // String actualString1 = "MY PHONE HANGS"; //Expected = > "SGNAH ENOHP YM
        String[] splitStr = str.split(" ");
        String newStr="";
        for(int i=splitStr.length-1;i>=0;i--){
            String str1 = splitStr[i];
            for(int j=str1.length()-1;j>=0;j--){
                newStr=newStr+str1.charAt(j);
            }
            newStr=newStr+" ";
        }
        System.out.println(newStr);
    }
}
