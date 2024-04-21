package singleTonClass;

public class SingleTonClass {
    //2nd step
    private static SingleTonClass obj =null;
    // 1 st step is to make a constructor is private to achieve the concept of singleTon class
    private SingleTonClass(){

    }
    // 3rd step
    public static SingleTonClass getInstance(){
        if(obj==null){
            obj=new SingleTonClass();
        }
        return obj;
    }


}
