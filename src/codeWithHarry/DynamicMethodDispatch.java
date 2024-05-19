package codeWithHarry;

/**
 *  This is very imp :
 *  https://www.youtube.com/watch?v=qbXNFOuD9k4&list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&index=49
 */
class Phone{
   public void name(){
        System.out.println("My name is java and I am in One class");
    }
    public void greet(){
        System.out.println("This is the greet method from class one");
    }
}

class SmartPhone extends Phone{
    @Override
    public void name(){
        System.out.println("My name is java and I am in Two class");
    }
    public void music(){
        System.out.println("This is the music method from class Two");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone one = new SmartPhone();   // This is allowed in JAVA
        one.greet();
        one.name();   // here is the catch.   // This the e.g. of Runtime Polymorphism
    }
}
