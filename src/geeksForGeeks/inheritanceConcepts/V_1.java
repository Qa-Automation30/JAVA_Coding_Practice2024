package geeksForGeeks.inheritanceConcepts;

public class V_1 {
// https://www.geeksforgeeks.org/output-java-program-set-20-inheritance/
   static class A
    {
        public A(String s)
        {
            System.out.print("A");
        }
    }

    public static class B extends A
    {
        public B(String s)
        {
            super("s");
            System.out.print("B");
        }

    }
    public static void main(String[] args)
    {
        B b = new B("C");
        System.out.println(" ");
    }
}
