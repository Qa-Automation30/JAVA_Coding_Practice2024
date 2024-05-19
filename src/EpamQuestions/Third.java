package EpamQuestions;
/**
 *  So the question was like can this code work ?
 */
class P1{
    private void m1(){
        System.out.println("parent class");
    }
}
class C1 extends P1{
    public void m1(){

    }
}
public class Third {


    public static void main(String[] args) {
        P1 p1 = new C1();
    }
}
