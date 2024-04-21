package factorial;

public class factorial_1 {
    public static void main(String[] args) {
        int num =6;
       System.out.println(calculateFact(num));
    }
    /* void calculateFact(int num){
            newNum =  newNum*num;
            while (num>1){
                calculateFact(num-1);
                break;
        }
         System.out.println(newNum);
    }*/
    static int calculateFact(int num){
        if(num==0||num==1){
            return 1;
        }
        else
            return num *calculateFact(num-1);
    }
}
