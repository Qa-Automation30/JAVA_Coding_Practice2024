package EpamQuestions;

public class QuestionAsked_Malyesia {

    public static void main(String[] args) {
        /**
         * Merge the two arrays and then sort it
         */
     //   int [] num ={65,76,10,77,100,1,2};
//        int [] num1 = {87,1,5,11,88,22,90};
//
//        List<Integer> list = new ArrayList<>();
//
//        for(int i=0;i<num.length;i++){
//            list.add(num[i]);
//        }
//        for(int j=0;j<num1.length;j++){
//            list.add(num1[j]);
//        }
//
//        Collections.sort(list);
//        System.out.println(list);


        /**
         * 2nd question
         */
        //Expected = > "YM ENOHP SGNAH
        String actualString = "MY PHONE HANGS";
        String [] str = actualString.split(" ");
        String newStr ="";

        for(int i=0;i<str.length;i++){
            String test = str[i];
            for(int j=test.length()-1;j>=0;j--){
                newStr=newStr+test.charAt(j);
            }
            newStr=newStr+" ";
        }
        System.out.println(newStr);
    }
    }
