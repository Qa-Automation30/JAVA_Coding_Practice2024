public class ExtractNumberFromString {
    public static void main(String[] args) {
        String text = "My phone number is 543-999-0000. Please call me!";
        // Get the o/p -> 543-999-0000
        int one = text.indexOf("is");
        int two = text.indexOf(".");
        System.out.println(one+"-----"+two);
       String str =  text.substring(text.indexOf("is")+2,text.indexOf(".")).trim();
       System.out.println(str);
    }
}
