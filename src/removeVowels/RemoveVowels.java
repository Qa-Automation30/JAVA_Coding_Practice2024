package removeVowels;

public class RemoveVowels {

    public static void main(String[] args) {
        String str =  "This is the string and need to remove vowels";
        remove(str);

    }
    static void remove(String str){
        String newStr ="";
        char[] ch = str.toLowerCase().toCharArray();
      for(char _ch : ch){
          if(_ch=='a' || _ch=='e' || _ch=='i' || _ch =='o' || _ch =='u'){

          }
          else {
              newStr=newStr+_ch;
          }
      }
      System.out.println(newStr);
    }
}
