package rev_March_2024;

public class ExtractNumberFromString_1 {
    public static void main(String[] args) {
        String str ="Showing 21 to 30 of 273 (28 Pages)";
        int index1= str.indexOf('(');
        int index2 = str.indexOf('P');
      System.out.println(str.substring(index1+1,index2).trim());
    }
}
