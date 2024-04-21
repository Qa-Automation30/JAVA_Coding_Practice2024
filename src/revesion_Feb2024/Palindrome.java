package revesion_Feb2024;

public class Palindrome {
    public static void main(String[] args) {
        String str = "radar";
        String newStr="";
        for(int i=str.length()-1;i>=0;i--){
            newStr=newStr+str.charAt(i);
        }
        System.out.println(newStr);
        if(str.equals(newStr)){
            System.out.println("TRUE");
        }
    }
}
