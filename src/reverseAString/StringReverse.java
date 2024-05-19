package reverseAString;

public class StringReverse {
    public static void main(String[] args) {
        String str1 ="This is my String";
        String str2 ="My name is test";

        //1st --->
        // o/p->   String my is This
        String strArr[]= str1.split(" ");
        String newStr ="";
        for(int i=strArr.length-1;i>=0;i--){
            newStr = newStr+" "+strArr[i];
        }
        System.out.println(newStr);

        //2nd--->
        // o/p--> tset si eman yM
        char[] ch = str2.toCharArray();
        String newStr2="";
        for(int i=ch.length-1;i>=0;i--){
            newStr2=newStr2+""+ch[i];
        }
        System.out.println(newStr2);

        // 3rd approach
        // o/p -> yM enohp si gnar
        String str3 =  "My phone is rang";
        String [] newStr1 = str3.split(" ");
        String result ="";
        for(int i=0;i<newStr1.length;i++){
            String st = newStr1[i];
            for(int j=st.length()-1;j>=0;j--){
                result = result+st.charAt(j);
            }
            result=result+" ";
        }
        System.out.println(result);
    }



}
