package inheritanceConcept;

public class ChildClassOne extends ParentClass {

    public String str ="ChildClassOne String";

    public void methodOne(){
        System.out.println("this is common method from ChildClassOne");
        super.methodOne();
    }
}
