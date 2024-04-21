package inheritanceConcept;

public class MainClass {

    public static void main(String[] args) {
        ChildClassOne childClassOne = new ChildClassOne();
        System.out.println(childClassOne.str);
        childClassOne.methodOne();
        childClassOne.parentMethod();
    }
}
