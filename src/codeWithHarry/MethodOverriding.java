package codeWithHarry;

class A {
        public void method1(){
            System.out.println("I am in method1 of class A");
        }
    public void method2(){
        System.out.println("I am in method2 of class A");
    }
}

class B extends A{

    @Override
    public void method2(){
        System.out.println("I am in method2 of class B");
    }
    public void method3(){
        System.out.println("I am in method3 of class B");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        // This asked in Wipro and UKG
        A a  = new B();
        a.method2();
    }
}
