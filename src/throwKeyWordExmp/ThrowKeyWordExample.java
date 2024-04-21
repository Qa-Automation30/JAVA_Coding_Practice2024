package throwKeyWordExmp;

public class ThrowKeyWordExample {
    public static void main(String[] args) {
        try {
            xyzMethod();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    static void xyzMethod() throws Exception {
        throw new Exception("This is my exception and you need to throw it");
    }
}
