package codeWithHarry;


class Parent {
    Parent(String name){
        System.out.println("This is parent class constructor" + "-->"+name);
    }
    public void method(){
        System.out.println("parent method");
    }
    public void method1(){
        System.out.println("test method");
    }
}

class Child extends Parent{
    Child(String name){
        super(name);
        System.out.println("This is child class constructor");
    }
    public void method(){
        System.out.println("this method is overloaded by child");
    }
}

public class InheritanceConcept {

    public static void main(String[] args) {
        Child child = new Child("Vivek");
        child.method();
        System.out.println("===============================");
        //===========================================
        Parent p = new Child("test");
        p.method();
        System.out.println("===============================");
        //===========================================
    }
}
