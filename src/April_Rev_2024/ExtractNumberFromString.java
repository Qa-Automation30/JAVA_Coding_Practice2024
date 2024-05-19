package April_Rev_2024;

public class ExtractNumberFromString {

    public static void main(String[] args) {
        String text = "My phone number is 543-999-0000. Please call me!";
        // 1st method to do
      /* String str1 = text.substring(text.indexOf("is")+2,text.indexOf(".")).trim();
       System.out.println(str1);*/

        //2nd approach by me-->
       String str = text.replaceAll("[a-zA-Z.!-]","").trim();
        System.out.println(str);

        String str2 = text.replaceAll("[^0-9]","");
        System.out.println(str2);

        String str1="sdfvsdf68fs^$#&%&))##^^dfsf8999fsdf09";
        String numberOnly= str1.replaceAll("[^0-9]", "");
        System.out.println(numberOnly);
    }
}
