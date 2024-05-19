package geeksForGeeks.stringsProblems;

public class CrazyString_1 {

    public static void main(String[] args) {
        String str = "Geeksforgeeks";
        String newStr =""+str.charAt(0);

        if(Character.isLowerCase(str.charAt(0))){
            for(int i=1;i<str.length();i++){
                if(i%2==1){
                    newStr=newStr+str.toUpperCase().charAt(i);
                }
                else {
                    newStr=newStr+str.toLowerCase().charAt(i);
                }
            }
        }
        else {

            for(int i=1;i<str.length();i++){
                if(i%2==0){
                    newStr=newStr+str.toLowerCase().charAt(i);
                }
                else {
                    newStr=newStr+str.toUpperCase().charAt(i);
                }
            }

        }
        System.out.println(newStr);
    }
}
