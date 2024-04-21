package reverseAString;

public class ReverseString {

    public static void main(String[] args) {
        String str = "this is the string and you need to reverse it";
        // op--> it reverse to need you and string the is this
        String[] str1 = str.split(" ");
        String newStr="";
        for(int i=str1.length-1;i>=0;i--){
            newStr =newStr+" "+str1[i];
        }
        System.out.println(newStr);
    }
}
