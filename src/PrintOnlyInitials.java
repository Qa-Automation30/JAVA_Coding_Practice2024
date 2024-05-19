public class PrintOnlyInitials {
    public static void main(String[] args) {
        String str = "Anoop Kumar Singh";
        //  A.K.S.
        String [] newStr = str.split(" ");
        StringBuilder newStr1= new StringBuilder();
        for(int i=0;i<newStr.length;i++){
           String test =  newStr[i];
           newStr1.append(test.charAt(0)).append(".");

        }
        System.out.println(newStr1);
    }
}
