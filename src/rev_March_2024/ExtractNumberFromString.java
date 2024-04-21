package rev_March_2024;

public class ExtractNumberFromString {

    // Get the o/p -> 543-999-0000
    public static void main(String[] args) {
        String text = "My phone number is 543-999-0000. Please call me!";
        int index1 = text.indexOf("is");
        int index2 = text.indexOf(".");

        System.out.println(text.substring(index1+2,index2).trim());
    }
}
