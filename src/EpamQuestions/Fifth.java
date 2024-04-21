package EpamQuestions;

public class Fifth {
    // Why the EMP id be always same for all emp ?

    public Fifth(String name){
        this.name = name;
    }

    private String name;
    private static int empId;
    static {
        empId++;
    }

    public void getInfo(){
        System.out.println(name +"-->"+empId);
    }

    public static void main(String[] args) {
        Fifth fifth1 = new Fifth("vivek");
        Fifth fifth2 = new Fifth("Kumar");
        fifth1.getInfo();
        fifth2.getInfo();
    }
}
