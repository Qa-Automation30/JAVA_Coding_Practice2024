package April_Rev_2024;

public class RemoveSpecialCharFromString {
    public static void main(String[] args) {
//        String str= "This#string%contains^special*characters&.";
        String str ="test#*&%^^^t^his$";
        String newStr = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(newStr);
    }
}
