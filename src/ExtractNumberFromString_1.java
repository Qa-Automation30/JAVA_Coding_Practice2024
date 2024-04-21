public class ExtractNumberFromString_1 {
    public static void main(String[] args) {
        String str ="Showing 21 to 30 of 273 (28 Pages)";
        // Need to extract the 28 only
        str.indexOf("(");
        str.indexOf("Pages");
        System.out.println(str.substring(str.indexOf("(")+1,str.indexOf("Pages")).trim());

    }
}
