package EpamQuestions;


// Un-comment the code and see the result, asked in Epam what could be the output
public class Fourth {
//    public class P1{
//        public void m1(){
//            System.out.println("parent class");
//        }
//    }
//    public class C1 extends P1{
//        protected void m1(){
//            System.out.println("Child class");
//        }
//    }
}
/**
 * In the given code, you're attempting to override the m1() method from the parent class P1 in the child class C1.
 * However, the m1() method in the parent class P1 is declared as public,
 * but in the child class C1, you're attempting to override it with a method that has a more restrictive access modifier, protected.
 * This is not allowed because a subclass cannot reduce the visibility of the inherited method.
 */
