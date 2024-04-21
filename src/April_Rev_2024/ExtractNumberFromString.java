package April_Rev_2024;

public class ExtractNumberFromString {

    public static void main(String[] args) {
        String text = "My phone number is 543-999-0000. Please call me!";
       String str1 = text.substring(text.indexOf("is")+2,text.indexOf(".")).trim();
       System.out.println(str1);
    }
}
