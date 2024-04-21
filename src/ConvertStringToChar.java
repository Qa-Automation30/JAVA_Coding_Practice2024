public class ConvertStringToChar {
    public static void main(String[] args) {
        String str ="QA Automation Engineer";

        char c1[] = str.toCharArray();
        System.out.println(c1);
        for(char ch : c1){
            if(ch!=' '){
                System.out.println(ch);
            }

        }
    }
}
