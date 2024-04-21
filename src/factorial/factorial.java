package factorial;

public class factorial {
    int newNum=1;
    public static void main(String[] args) {
        int num =6;
   System.out.println(new factorial().calculateFact(num));
    }
     int calculateFact(int num){
            newNum =  newNum*num;
            System.out.println(newNum);
            if(num==1||num==0){
                return 1;
            }
            else {
                calculateFact(num-1);
            }
            return newNum;
        }
    }

