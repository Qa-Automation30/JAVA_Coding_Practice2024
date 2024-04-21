package revesion_Feb2024;

public class Tomorrow {

    /**
     * output of the programme -> t1m2rr3w
     * output of the programme -> t$m$$rr$$$w
     */
    public static void main(String[] args) {
        String str = "Tomorrow";
        String newStr="";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='o'){
                count++;
                for(int j=0;j<count;j++){
                    newStr=newStr+"$";
                }
            }
            else {
                newStr=newStr+str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
