public class RemoveSpecificChar {
    public static void main(String[] args) {
        // 1--> Method one
        String s = "Anoop Singh";
        String [] str  = s.split("o|h");
        String res ="";
        for(String m :str){
            res = res+m;
        }
        System.out.println(res);

        // Method 2 ->
        String s1 = "Anoop Singh";
        String s2 = s1.replaceAll("o|h|A","");
        System.out.println(s2);

    }
}
