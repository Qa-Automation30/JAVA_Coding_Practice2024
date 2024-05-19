package rev_March_2024;

public class PrintallPermutns_1 {
    public static void main(String[] args) {
        String str ="USA";
        getAllPermutaion("",str);
    }

    static void getAllPermutaion(String preFix,String str){
        int len = str.length();
        if(len==0){
            System.out.println(preFix);
        }
        else {
            for(int i=0;i<len;i++){
                getAllPermutaion(preFix+str.charAt(i),str.substring(0,i)+str.substring(i+1,len));
            }
        }
    }
}
