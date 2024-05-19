public class ExtractNumberFromString_1 {
    public static void main(String[] args) {
        String str ="Showing 21 to 30 of 273 (28 Pages)";
        // Need to extract the 28 only
        int index1 = str.indexOf("(");
        int index2 = str.indexOf("Pages");
        System.out.println(str.substring(index1+1,index2).trim());

    }
}
