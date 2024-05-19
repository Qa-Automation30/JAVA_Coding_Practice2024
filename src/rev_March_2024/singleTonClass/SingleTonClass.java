package rev_March_2024.singleTonClass;

public class SingleTonClass {

    private static SingleTonClass obj =null;

    private SingleTonClass(){

    }

    static SingleTonClass createObject(){
        if(obj==null){
           obj = new SingleTonClass();
           return obj;
        }
        return obj;
    }
}
