package EpamQuestions.ConstructorChaining;

public class ConstructorChainingInAnotherClass {

  static class parent{

        parent(){
            System.out.println("This is parent class constructor");
        }
        parent(int x){
            System.out.println("This is parent class constructor with value"+ x);
        }

    }

   static class child extends parent{
        child(){
            System.out.println("This is child class constructor");
        }
        child(int x){
            super(1);
            System.out.println("This is child class constructor with value"+ x);
        }
    }

    public static void main(String[] args){
        child obj = new child(1);

        //  child obj = new child();
    }

}
