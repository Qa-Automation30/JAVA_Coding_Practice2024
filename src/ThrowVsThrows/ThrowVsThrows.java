package ThrowVsThrows;

public class ThrowVsThrows {
    //https://www.youtube.com/watch?v=sOcZgWyoQuk

    // This is the example of throws keyword

    public static void main(String[] args) {
        int res = 0;
        try {
            res = divide(10,2);
            System.out.println(res);
        } catch (Exception e) {
           System.out.println("Can not divide by zero");
        }
    }

    /**
     *  throws keyword ye bata raha hai ki, ye code kis type ki exeetion throw kar sakta hai..
     *  to jo bhi is method ko use kare wo person is exception ko handle kare apne code me..
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException
     */
    static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
}
