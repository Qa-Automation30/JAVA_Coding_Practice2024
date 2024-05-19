public class Accenture {
    /**
     *  What you need to do -> put all the zeros at the starting of the String
     */
    public static void main(String[] args) {
        String str = "324001212000";
        String str1 = str.replaceAll("[0]","");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<str.length();i++){
          if(str.charAt(i)=='0'){
              stringBuilder.append(str.charAt(i));
          }
        }
        System.out.println(stringBuilder.append(str1));
    }
}
