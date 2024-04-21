package palindrome;

public class Palindrome {

    public static void main(String[] args) {
        String str = "radar";
        String revStr = "";
        for(int i =str.length()-1;i>=0;i--){
            revStr = revStr+str.charAt(i);
        }
        System.out.println(revStr);
        if(str.equals(revStr)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
