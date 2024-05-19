package EpamQuestions;

public class Fifth {
    // Why the EMP id be always same for all emp ?

    private String name;
    private static int empId;

    public Fifth(String name){
        this.name = name;
    }

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

/**
 *  In your code, the empId variable is declared as static, which means it belongs to the class rather than to individual instances of the class.
 *  ====================
 *
 *  This block of code will only execute once when the class is loaded. So, each time an object of the Fifth class is created,
 *  it will increment empId by 1, but since it's a static variable shared by all instances, the change will be reflected across all objects.
 */
