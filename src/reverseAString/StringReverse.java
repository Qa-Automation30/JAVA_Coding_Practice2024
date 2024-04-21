package reverseAString;

public class StringReverse {
    public static void main(String[] args) {
        String str1 ="This is my String";
        String str2 ="My name is test";

        //1st --->
        String strArr[]= str1.split(" ");
        String newStr ="";
        for(int i=strArr.length-1;i>=0;i--){
            newStr = newStr+" "+strArr[i];
        }
        System.out.println(newStr);

        //2nd--->
        char[] ch = str2.toCharArray();
        String newStr2="";
        for(int i=ch.length-1;i>=0;i--){
            newStr2=newStr2+""+ch[i];
        }
        System.out.println(newStr2);

    }



}
